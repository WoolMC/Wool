package io.github.woolmc.wool.entity.hostile;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;

import io.github.woolmc.wool.entity.WoolMob;
import net.minecraft.entity.mob.CreeperEntity;

public class WoolCreeper extends WoolMob<CreeperEntity> implements Creeper {

	public WoolCreeper(CreeperEntity handle) {
		super(handle);
	}

	@Override
	public boolean isPowered() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setPowered(boolean value) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void setMaxFuseTicks(int ticks) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public int getMaxFuseTicks() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setExplosionRadius(int radius) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public int getExplosionRadius() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void explode() {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void ignite() {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public EntityType getType() {
		return EntityType.CREEPER;
	}

}
