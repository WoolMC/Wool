package io.github.woolmc.wool.mixin.entity;

import org.bukkit.entity.Item;
import org.spongepowered.asm.mixin.Mixin;

import io.github.woolmc.wool.server.entity.WoolItem;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.ItemEntity;

@Mixin(ItemEntity.class)
public class MixinItemEntity implements BukkitEntityAccess<Item> {
	
	private Item bukkitEntity;
	
	public void onConstructor() {
		bukkitEntity = new WoolItem(MixinHacks.cast(ItemEntity.class, this));
	}

	@Override
	public Item getBukkitEntity() {
		return bukkitEntity;
	}

}
