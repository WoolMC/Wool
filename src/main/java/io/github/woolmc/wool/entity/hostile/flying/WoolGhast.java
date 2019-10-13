package io.github.woolmc.wool.entity.hostile.flying;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Ghast;

import net.minecraft.entity.mob.GhastEntity;

public class WoolGhast extends WoolFlyingEntity<GhastEntity> implements Ghast {

	protected WoolGhast(GhastEntity handle) {
		super(handle);
	}

	@Override
	public EntityType getType() {
		return EntityType.GHAST;
	}

}
