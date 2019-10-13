package io.github.woolmc.wool.entity;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Pose;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.Vector;

import io.github.woolmc.wool.BukkitServerAccess;
import io.github.woolmc.wool.BukkitWorldAccess;
import io.github.woolmc.wool.String2TextUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.util.BlockRotation;

public abstract class WoolEntity<T extends Entity> implements org.bukkit.entity.Entity {
	
	protected WoolEntity(T handle) {
		this.handle = handle;
	}
	
	protected T handle;
	

	// IMPL Methods
	
	@Override
	public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
		throw new UnsupportedOperationException("Unsupported");
		
	}


	@Override
	public List<MetadataValue> getMetadata(String metadataKey) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public boolean hasMetadata(String metadataKey) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public void removeMetadata(String metadataKey, Plugin owningPlugin) {
		throw new UnsupportedOperationException("Unsupported");
		
	}


	@Override
	public void sendMessage(String message) {
		getHandle().sendMessage(String2TextUtil.fromStringOrNull(message));
	}


	@Override
	public void sendMessage(String[] messages) {
		getHandle().sendMessage(String2TextUtil.fromStringOrNull(new StringBuilder().append(messages).toString()));
	}


	@Override
	public String getName() {
		return getHandle().getEntityName();
	}


	@Override
	public boolean isPermissionSet(String name) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public boolean isPermissionSet(Permission perm) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public boolean hasPermission(String name) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public boolean hasPermission(Permission perm) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public PermissionAttachment addAttachment(Plugin plugin) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public void removeAttachment(PermissionAttachment attachment) {
		throw new UnsupportedOperationException("Unsupported");
		
	}


	@Override
	public void recalculatePermissions() {
		throw new UnsupportedOperationException("Unsupported");
		
	}


	@Override
	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public boolean isOp() {
		// TODO Permissions
		return false;
	}


	@Override
	public void setOp(boolean value) {
		// TODO Permissions
	}


	@Override
	public String getCustomName() {
		return String2TextUtil.fromComponent(getHandle().getCustomName());
	}


	@Override
	public void setCustomName(String name) {
		getHandle().setCustomName(String2TextUtil.fromStringOrNull(name));
	}


	@Override
	public PersistentDataContainer getPersistentDataContainer() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public Location getLocation() {
		return new Location(null, getHandle().x, getHandle().y, getHandle().z); // TODO World Instance
	}


	@Override
	public Location getLocation(Location loc) {
		loc = getLocation();
		return loc;
	}


	@Override
	public void setVelocity(Vector velocity) {
		throw new UnsupportedOperationException("Unsupported");
		
	}


	@Override
	public Vector getVelocity() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public double getHeight() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public double getWidth() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public BoundingBox getBoundingBox() {
		return new BoundingBox();
	}


	@Override
	public boolean isOnGround() {
		if (getHandle() instanceof ArrowEntity) {
            return ((ArrowEntity) getHandle()).onGround;
        }
        return getHandle().onGround;
	}


	@Override
	public World getWorld() {
		return BukkitWorldAccess.getWorld(getHandle().getEntityWorld());
	}


	@Override
	public void setRotation(float yaw, float pitch) {
		getHandle(); // TODO set rotation
	}


	@Override
	public boolean teleport(Location location) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public boolean teleport(org.bukkit.entity.Entity destination) {
		throw new UnsupportedOperationException("Unsupported");
	}
	
	@Override
	public boolean teleport(org.bukkit.entity.Entity destination, TeleportCause cause) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public List<org.bukkit.entity.Entity> getNearbyEntities(double x, double y, double z) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public int getEntityId() {
		return getHandle().getEntityId();
	}


	@Override
	public int getFireTicks() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public int getMaxFireTicks() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public void setFireTicks(int ticks) {
		throw new UnsupportedOperationException("Unsupported");
		
	}


	@Override
	public void remove() {
		getHandle().remove();
	}


	@Override
	public boolean isDead() {
		return !getHandle().isAlive(); // TODO opposites
	}


	@Override
	public boolean isValid() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public Server getServer() {
		return BukkitServerAccess.getServer(handle.getServer());
	}


	@Override
	public boolean isPersistent() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public void setPersistent(boolean persistent) {
		throw new UnsupportedOperationException("Unsupported");
		
	}


	@Override
	public org.bukkit.entity.Entity getPassenger() {
		return BukkitEntityAccess.getEntity(getHandle().getPrimaryPassenger());
	}


	@Override
	public boolean setPassenger(org.bukkit.entity.Entity passenger) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public List<org.bukkit.entity.Entity> getPassengers() {
		return BukkitEntityAccess.getEntity(getHandle().getPassengerList());
	}


	@Override
	public boolean addPassenger(org.bukkit.entity.Entity passenger) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public boolean removePassenger(org.bukkit.entity.Entity passenger) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public boolean isEmpty() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public boolean eject() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public float getFallDistance() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public void setFallDistance(float distance) {
		throw new UnsupportedOperationException("Unsupported");
		
	}


	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		throw new UnsupportedOperationException("Unsupported");
		
	}


	@Override
	public EntityDamageEvent getLastDamageCause() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public UUID getUniqueId() {
		return getHandle().getUuid();
	}


	@Override
	public int getTicksLived() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public void setTicksLived(int value) {
		throw new UnsupportedOperationException("Unsupported");
		
	}


	@Override
	public void playEffect(EntityEffect type) {
		throw new UnsupportedOperationException("Unsupported");
		
	}


	@Override
	public boolean isInsideVehicle() {
		return getHandle().hasVehicle();
	}


	@Override
	public boolean leaveVehicle() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public org.bukkit.entity.Entity getVehicle() {
		return BukkitEntityAccess.getEntity(getHandle().getVehicle());
	}


	// IMPL Methods
	
	@Override
	public void setCustomNameVisible(boolean flag) {
		getHandle().setCustomNameVisible(flag);
	}


	@Override
	public boolean isCustomNameVisible() {
		return getHandle().isCustomNameVisible();
	}


	@Override
	public void setGlowing(boolean flag) {
		getHandle().setGlowing(flag);
	}


	@Override
	public boolean isGlowing() {
		return getHandle().isGlowing();
	}


	@Override
	public void setInvulnerable(boolean flag) {
		getHandle().setInvulnerable(flag);
	}


	@Override
	public boolean isInvulnerable() {
		return getHandle().isInvulnerable();
	}


	@Override
	public boolean isSilent() {
		return getHandle().isSilent();
	}


	@Override
	public void setSilent(boolean flag) {
		getHandle().setSilent(flag);
	}


	@Override
	public boolean hasGravity() {
		return !getHandle().hasNoGravity(); // TODO opposites?
	}


	@Override
	public void setGravity(boolean gravity) {
		getHandle().setNoGravity(!gravity); // TODO Opposites?
	}


	@Override
	public int getPortalCooldown() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public void setPortalCooldown(int cooldown) {
		throw new UnsupportedOperationException("Unsupported");
		
	}


	@Override
	public Set<String> getScoreboardTags() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public boolean addScoreboardTag(String tag) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public boolean removeScoreboardTag(String tag) {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public PistonMoveReaction getPistonMoveReaction() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public BlockFace getFacing() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public Pose getPose() {
		throw new UnsupportedOperationException("Unsupported");
	}


	@Override
	public abstract EntityType getType();


	// IMPL Methods
	
	public T getHandle() {
		return handle;
	}
	
}
