package io.github.woolmc.wool.mixin.entity.hostile;

import org.bukkit.entity.WitherSkeleton;
import org.spongepowered.asm.mixin.Mixin;

import io.github.woolmc.wool.mixin.entity.BukkitEntityAccess;
import io.github.woolmc.wool.server.entity.skeleton.WoolWitherSkeleton;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.WitherSkeletonEntity;

@Mixin(WitherSkeletonEntity.class)
public class MixinWitherSkeletonEntity implements BukkitEntityAccess<WitherSkeleton> {

	private WitherSkeleton bukkitEntity;

	@Override
	public WitherSkeleton getBukkitEntity() {
		return bukkitEntity;
	}
	
	public void onConstructor() {
		bukkitEntity = new WoolWitherSkeleton(MixinHacks.cast(WitherSkeletonEntity.class, this));
	}
}
