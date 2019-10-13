package io.github.woolmc.wool.entity;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;

public class WoolItem extends WoolEntity implements Item {

	public WoolItem(ItemEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack getItemStack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setItemStack(ItemStack stack) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getPickupDelay() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPickupDelay(int delay) {
		getHandle().setPickupDelay(delay);
	}

	@Override
	public EntityType getType() {
		return EntityType.DROPPED_ITEM;
	}
	
	public ItemEntity getHandle() {
		return (ItemEntity) handle;
	}

}
