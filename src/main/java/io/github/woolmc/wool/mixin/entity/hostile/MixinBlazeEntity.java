package io.github.woolmc.wool.mixin.entity.hostile;

import org.bukkit.entity.Blaze;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.woolmc.wool.entity.BukkitEntityAccess;
import io.github.woolmc.wool.entity.hostile.WoolBlaze;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.BlazeEntity;

@Mixin(BlazeEntity.class)
public class MixinBlazeEntity implements BukkitEntityAccess<Blaze> {
	private Blaze bukkitEntity;

	@Override
	public Blaze getBukkitEntity() {
		return bukkitEntity;
	}
	
	@Inject(at = @At("RETURN"), method = "<init>*")
	public void onConstructor(CallbackInfo ci) {
		bukkitEntity = new WoolBlaze(MixinHacks.cast(BlazeEntity.class, this));
	}
}
