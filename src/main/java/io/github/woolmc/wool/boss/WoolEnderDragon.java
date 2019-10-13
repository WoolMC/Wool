package io.github.woolmc.wool.boss;

import org.bukkit.boss.BossBar;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.EntityType;

import net.minecraft.entity.boss.dragon.EnderDragonEntity;

public class WoolEnderDragon extends WoolComplexLivingEntity implements EnderDragon {

	protected WoolEnderDragon(EnderDragonEntity handle) {
		super(handle);
	}

	@Override
	public BossBar getBossBar() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Phase getPhase() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setPhase(Phase phase) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public EntityType getType() {
		return EntityType.ENDER_DRAGON;
	}

}
