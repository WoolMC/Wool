package io.github.woolmc.wool.entity;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;

public class WoolItem extends WoolEntity<ItemEntity> implements Item {

	public WoolItem(ItemEntity handle) {
		super(handle);
	}

	@Override
	public ItemStack getItemStack() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setItemStack(ItemStack stack) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public int getPickupDelay() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setPickupDelay(int delay) {
		getHandle().setPickupDelay(delay);
	}

	@Override
	public EntityType getType() {
		return EntityType.DROPPED_ITEM;
	}

}
