package io.github.woolmc.wool.entity;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.bukkit.FluidCollisionMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.memory.MemoryKey;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;

public abstract class WoolLivingEntity<T extends net.minecraft.entity.LivingEntity> extends WoolEntity<T> implements LivingEntity {

	protected WoolLivingEntity(T handle) {
		super(handle);
	}

	@Override
	public AttributeInstance getAttribute(Attribute attribute) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void damage(double amount) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void damage(double amount, Entity source) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public double getHealth() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setHealth(double health) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public double getAbsorptionAmount() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setAbsorptionAmount(double amount) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public double getMaxHealth() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setMaxHealth(double health) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void resetMaxHealth() {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public <T extends Projectile> T launchProjectile(Class<? extends T> projectile) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public <T extends Projectile> T launchProjectile(Class<? extends T> projectile, Vector velocity) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public double getEyeHeight() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public double getEyeHeight(boolean ignorePose) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Location getEyeLocation() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public List<Block> getLineOfSight(Set<Material> transparent, int maxDistance) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Block getTargetBlock(Set<Material> transparent, int maxDistance) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(Set<Material> transparent, int maxDistance) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Block getTargetBlockExact(int maxDistance) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Block getTargetBlockExact(int maxDistance, FluidCollisionMode fluidCollisionMode) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public RayTraceResult rayTraceBlocks(double maxDistance) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public RayTraceResult rayTraceBlocks(double maxDistance, FluidCollisionMode fluidCollisionMode) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getRemainingAir() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setRemainingAir(int ticks) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public int getMaximumAir() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setMaximumAir(int ticks) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public int getMaximumNoDamageTicks() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public double getLastDamage() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setLastDamage(double damage) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public int getNoDamageTicks() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public Player getKiller() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean addPotionEffect(PotionEffect effect) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean addPotionEffect(PotionEffect effect, boolean force) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean addPotionEffects(Collection<PotionEffect> effects) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean hasPotionEffect(PotionEffectType type) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public PotionEffect getPotionEffect(PotionEffectType type) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void removePotionEffect(PotionEffectType type) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public Collection<PotionEffect> getActivePotionEffects() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean hasLineOfSight(Entity other) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean getRemoveWhenFarAway() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setRemoveWhenFarAway(boolean remove) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public EntityEquipment getEquipment() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setCanPickupItems(boolean pickup) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public boolean getCanPickupItems() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isLeashed() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Entity getLeashHolder() throws IllegalStateException {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean setLeashHolder(Entity holder) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isGliding() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setGliding(boolean gliding) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public boolean isSwimming() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setSwimming(boolean swimming) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public boolean isRiptiding() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isSleeping() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setAI(boolean ai) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public boolean hasAI() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setCollidable(boolean collidable) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public boolean isCollidable() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public <T> T getMemory(MemoryKey<T> memoryKey) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public <T> void setMemory(MemoryKey<T> memoryKey, T memoryValue) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public abstract EntityType getType();

}
