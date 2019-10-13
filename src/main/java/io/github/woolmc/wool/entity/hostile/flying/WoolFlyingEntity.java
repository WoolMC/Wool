package io.github.woolmc.wool.entity.hostile.flying;

import org.bukkit.entity.Flying;

import io.github.woolmc.wool.entity.WoolMob;
import net.minecraft.entity.mob.FlyingEntity;

public abstract class WoolFlyingEntity<T extends FlyingEntity> extends WoolMob<T> implements Flying {

	protected WoolFlyingEntity(T handle) {
		super(handle);
	}

}
