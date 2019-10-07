package io.github.woolmc.wool.mixin.entity.hostile;

import org.bukkit.entity.Skeleton;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.woolmc.wool.entity.BukkitEntityAccess;
import io.github.woolmc.wool.entity.skeleton.WoolSkeleton;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.SkeletonEntity;

@Mixin(SkeletonEntity.class)
public class MixinSkeletonEntity implements BukkitEntityAccess<Skeleton> {
	private Skeleton bukkitEntity;

	@Override
	public Skeleton getBukkitEntity() {
		return bukkitEntity;
	}
	
	@Inject(at = @At("RETURN"), method = "<init>*")
	public void onConstructor(CallbackInfo ci) {
		bukkitEntity = new WoolSkeleton(MixinHacks.cast(SkeletonEntity.class, this));
	}
}
