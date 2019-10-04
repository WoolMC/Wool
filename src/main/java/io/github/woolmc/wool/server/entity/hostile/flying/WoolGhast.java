package io.github.woolmc.wool.server.entity.hostile.flying;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Ghast;

import net.minecraft.entity.mob.GhastEntity;

public class WoolGhast extends WoolFlyingEntity implements Ghast {

	protected WoolGhast(GhastEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public EntityType getType() {
		return EntityType.GHAST;
	}

}
