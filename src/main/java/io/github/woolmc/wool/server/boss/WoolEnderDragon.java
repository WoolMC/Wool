package io.github.woolmc.wool.server.boss;

import org.bukkit.boss.BossBar;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.EntityType;

import net.minecraft.entity.boss.dragon.EnderDragonEntity;

public class WoolEnderDragon extends WoolComplexLivingEntity implements EnderDragon {

	protected WoolEnderDragon(EnderDragonEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BossBar getBossBar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phase getPhase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPhase(Phase phase) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntityType getType() {
		return EntityType.ENDER_DRAGON;
	}

}
