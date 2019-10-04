package io.github.woolmc.wool.mixin.entity;

import org.bukkit.entity.Skeleton;
import org.spongepowered.asm.mixin.Mixin;

import io.github.woolmc.wool.server.entity.skeleton.WoolSkeleton;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.SkeletonEntity;

@Mixin(SkeletonEntity.class)
public class MixinSkeletonEntity implements BukkitEntityAccess<Skeleton> {
	private Skeleton bukkitEntity;

	@Override
	public Skeleton getBukkitEntity() {
		return bukkitEntity;
	}
	
	public void onConstructor() {
		bukkitEntity = new WoolSkeleton(MixinHacks.cast(SkeletonEntity.class, this));
	}
}
