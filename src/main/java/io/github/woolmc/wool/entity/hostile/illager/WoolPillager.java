package io.github.woolmc.wool.entity.hostile.illager;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Pillager;
import org.bukkit.inventory.Inventory;

import net.minecraft.entity.mob.PillagerEntity;

public class WoolPillager extends WoolIllager<PillagerEntity> implements Pillager {

	protected WoolPillager(PillagerEntity handle) {
		super(handle);
	}

	@Override
	public Inventory getInventory() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public EntityType getType() {
		return EntityType.PILLAGER;
	}

}
