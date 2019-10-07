package io.github.woolmc.wool.mixin.entity.hostile;

import org.bukkit.entity.Stray;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.woolmc.wool.entity.BukkitEntityAccess;
import io.github.woolmc.wool.entity.skeleton.WoolStray;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.StrayEntity;

@Mixin(StrayEntity.class)
public class MixinStrayEntity implements BukkitEntityAccess<Stray> {
	private Stray bukkitEntity;

	@Override
	public Stray getBukkitEntity() {
		return bukkitEntity;
	}
	
	@Inject(at = @At("RETURN"), method = "<init>*")
	public void onConstructor(CallbackInfo ci) {
		bukkitEntity = new WoolStray(MixinHacks.cast(StrayEntity.class, this));
	}
}
