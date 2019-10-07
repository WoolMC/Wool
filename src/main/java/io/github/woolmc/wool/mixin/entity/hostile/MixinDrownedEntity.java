package io.github.woolmc.wool.mixin.entity.hostile;

import org.bukkit.entity.Drowned;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.woolmc.wool.entity.BukkitEntityAccess;
import io.github.woolmc.wool.entity.hostile.zombie.WoolDrowned;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.DrownedEntity;

@Mixin(DrownedEntity.class)
public class MixinDrownedEntity implements BukkitEntityAccess<Drowned> {
	private Drowned bukkitEntity;

	@Override
	public Drowned getBukkitEntity() {
		return bukkitEntity;
	}
	
	@Inject(at = @At("RETURN"), method = "<init>*")
	public void onConstructor(CallbackInfo ci) {
		bukkitEntity = new WoolDrowned(MixinHacks.cast(DrownedEntity.class, this));
	}

}
