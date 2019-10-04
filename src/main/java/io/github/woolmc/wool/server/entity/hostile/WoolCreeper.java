package io.github.woolmc.wool.server.entity.hostile;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;

import io.github.woolmc.wool.server.entity.WoolMob;
import net.minecraft.entity.mob.CreeperEntity;

public class WoolCreeper extends WoolMob implements Creeper {

	protected WoolCreeper(CreeperEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isPowered() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setPowered(boolean value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMaxFuseTicks(int ticks) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMaxFuseTicks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setExplosionRadius(int radius) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getExplosionRadius() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void explode() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ignite() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntityType getType() {
		return EntityType.CREEPER;
	}

}
