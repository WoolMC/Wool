package io.github.woolmc.wool.server.entity.hostile.illager;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Pillager;
import org.bukkit.inventory.Inventory;

import net.minecraft.entity.mob.PillagerEntity;

public class WoolPillager extends WoolIllager implements Pillager {

	protected WoolPillager(PillagerEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Inventory getInventory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityType getType() {
		return EntityType.PILLAGER;
	}

}
