package io.github.woolmc.wool.entity;

import org.bukkit.entity.Vehicle;

import net.minecraft.entity.Entity;

public abstract class WoolVehicle<T extends Entity> extends WoolEntity<T> implements Vehicle {

	protected WoolVehicle(T handle) {
		super(handle);
	}

}
