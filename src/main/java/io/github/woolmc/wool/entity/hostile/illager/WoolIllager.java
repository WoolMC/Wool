package io.github.woolmc.wool.entity.hostile.illager;

import org.bukkit.entity.Illager;

import net.minecraft.entity.mob.IllagerEntity;

public abstract class WoolIllager<T extends IllagerEntity> extends WoolRaider<T> implements Illager {

	protected WoolIllager(T handle) {
		super(handle);
	}
	
}
