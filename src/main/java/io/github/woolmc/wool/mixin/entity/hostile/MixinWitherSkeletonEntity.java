package io.github.woolmc.wool.mixin.entity.hostile;

import org.bukkit.entity.WitherSkeleton;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.woolmc.wool.entity.BukkitEntityAccess;
import io.github.woolmc.wool.entity.skeleton.WoolWitherSkeleton;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.WitherSkeletonEntity;

@Mixin(WitherSkeletonEntity.class)
public class MixinWitherSkeletonEntity implements BukkitEntityAccess<WitherSkeleton> {

	private WitherSkeleton bukkitEntity;

	@Override
	public WitherSkeleton getBukkitEntity() {
		return bukkitEntity;
	}
	
	@Inject(at = @At("RETURN"), method = "<init>*")
	public void onConstructor(CallbackInfo ci) {
		bukkitEntity = new WoolWitherSkeleton(MixinHacks.cast(WitherSkeletonEntity.class, this));
	}
}
