package io.github.woolmc.wool.mixin.entity;

import org.bukkit.entity.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.woolmc.wool.entity.BukkitEntityAccess;
import io.github.woolmc.wool.entity.WoolItem;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.ItemEntity;

@Mixin(ItemEntity.class)
public class MixinItemEntity implements BukkitEntityAccess<Item> {
	
	private Item bukkitEntity;
	
	@Inject(at = @At("RETURN"), method = "<init>*")
	public void onConstructor(CallbackInfo ci) {
		bukkitEntity = new WoolItem(MixinHacks.cast(ItemEntity.class, this));
	}

	@Override
	public Item getBukkitEntity() {
		return bukkitEntity;
	}

}
