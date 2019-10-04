package io.github.woolmc.wool.server.entity;

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

public abstract class WoolLivingEntity extends WoolEntity implements LivingEntity {

	protected WoolLivingEntity(net.minecraft.entity.LivingEntity handle) {
		super(handle);
	}

	@Override
	public AttributeInstance getAttribute(Attribute attribute) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void damage(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void damage(double amount, Entity source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setHealth(double health) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getAbsorptionAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAbsorptionAmount(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getMaxHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMaxHealth(double health) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetMaxHealth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T extends Projectile> T launchProjectile(Class<? extends T> projectile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Projectile> T launchProjectile(Class<? extends T> projectile, Vector velocity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getEyeHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getEyeHeight(boolean ignorePose) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Location getEyeLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Block> getLineOfSight(Set<Material> transparent, int maxDistance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Block getTargetBlock(Set<Material> transparent, int maxDistance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(Set<Material> transparent, int maxDistance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Block getTargetBlockExact(int maxDistance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Block getTargetBlockExact(int maxDistance, FluidCollisionMode fluidCollisionMode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RayTraceResult rayTraceBlocks(double maxDistance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RayTraceResult rayTraceBlocks(double maxDistance, FluidCollisionMode fluidCollisionMode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRemainingAir() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRemainingAir(int ticks) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMaximumAir() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMaximumAir(int ticks) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMaximumNoDamageTicks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getLastDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setLastDamage(double damage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNoDamageTicks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Player getKiller() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addPotionEffect(PotionEffect effect) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPotionEffect(PotionEffect effect, boolean force) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPotionEffects(Collection<PotionEffect> effects) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPotionEffect(PotionEffectType type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PotionEffect getPotionEffect(PotionEffectType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePotionEffect(PotionEffectType type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<PotionEffect> getActivePotionEffects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasLineOfSight(Entity other) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getRemoveWhenFarAway() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setRemoveWhenFarAway(boolean remove) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntityEquipment getEquipment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCanPickupItems(boolean pickup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getCanPickupItems() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLeashed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Entity getLeashHolder() throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setLeashHolder(Entity holder) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGliding() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setGliding(boolean gliding) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSwimming() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSwimming(boolean swimming) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isRiptiding() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSleeping() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAI(boolean ai) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasAI() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCollidable(boolean collidable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isCollidable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> T getMemory(MemoryKey<T> memoryKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> void setMemory(MemoryKey<T> memoryKey, T memoryValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public abstract EntityType getType();
	
	private net.minecraft.entity.LivingEntity getHandle() {
		return (net.minecraft.entity.LivingEntity) handle;
	}

}
