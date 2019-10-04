package io.github.woolmc.wool.server.entity;

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

import net.minecraft.entity.Entity;

public abstract class WoolEntity implements org.bukkit.entity.Entity {
	
	protected WoolEntity(Entity handle) {
		this.handle = handle;
	}
	
	protected Entity handle;
	

	// IMPL Methods
	
	@Override
	public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<MetadataValue> getMetadata(String metadataKey) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean hasMetadata(String metadataKey) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void removeMetadata(String metadataKey, Plugin owningPlugin) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void sendMessage(String message) {
		getHandle().sendMessage(text_1); // TODO Convert to text
	}


	@Override
	public void sendMessage(String[] messages) {
		getHandle().sendMessage(text_1); // TODO Convert to text
	}


	@Override
	public String getName() {
		return getHandle().getEntityName();
	}


	@Override
	public boolean isPermissionSet(String name) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isPermissionSet(Permission perm) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean hasPermission(String name) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean hasPermission(Permission perm) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PermissionAttachment addAttachment(Plugin plugin) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void removeAttachment(PermissionAttachment attachment) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void recalculatePermissions() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		// TODO Auto-generated method stub
		return null;
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
		return getHandle().getCustomName(); // TODO Convert to text
	}


	@Override
	public void setCustomName(String name) {
		getHandle().setCustomName(text_1); // TODO Conver to text
	}


	@Override
	public PersistentDataContainer getPersistentDataContainer() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		
	}


	@Override
	public Vector getVelocity() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public BoundingBox getBoundingBox() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isOnGround() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public World getWorld() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setRotation(float yaw, float pitch) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean teleport(Location location) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean teleport(org.bukkit.entity.Entity destination) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean teleport(org.bukkit.entity.Entity destination, TeleportCause cause) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<org.bukkit.entity.Entity> getNearbyEntities(double x, double y, double z) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int getEntityId() {
		return getHandle().getEntityId();
	}


	@Override
	public int getFireTicks() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getMaxFireTicks() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setFireTicks(int ticks) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isDead() {
		return !getHandle().isAlive(); // TODO opposites
	}


	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Server getServer() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isPersistent() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void setPersistent(boolean persistent) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public org.bukkit.entity.Entity getPassenger() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean setPassenger(org.bukkit.entity.Entity passenger) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<org.bukkit.entity.Entity> getPassengers() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean addPassenger(org.bukkit.entity.Entity passenger) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean removePassenger(org.bukkit.entity.Entity passenger) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean eject() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public float getFallDistance() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setFallDistance(float distance) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public EntityDamageEvent getLastDamageCause() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UUID getUniqueId() {
		return getHandle().getUuid();
	}


	@Override
	public int getTicksLived() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setTicksLived(int value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void playEffect(EntityEffect type) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isInsideVehicle() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean leaveVehicle() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public org.bukkit.entity.Entity getVehicle() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setPortalCooldown(int cooldown) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Set<String> getScoreboardTags() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean addScoreboardTag(String tag) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean removeScoreboardTag(String tag) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public PistonMoveReaction getPistonMoveReaction() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public BlockFace getFacing() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Pose getPose() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public abstract EntityType getType();


	// IMPL Methods
	
	private Entity getHandle() {
		return handle;
	}
	
}
