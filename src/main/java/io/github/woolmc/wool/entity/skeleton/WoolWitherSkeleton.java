package io.github.woolmc.wool.entity.skeleton;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.WitherSkeleton;

import io.github.woolmc.wool.entity.WoolMob;
import net.minecraft.entity.mob.WitherSkeletonEntity;

public class WoolWitherSkeleton extends WoolMob<WitherSkeletonEntity> implements WitherSkeleton {

	public WoolWitherSkeleton(WitherSkeletonEntity handle) {
		super(handle);
	}

	@Override
	public SkeletonType getSkeletonType() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setSkeletonType(SkeletonType type) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public EntityType getType() {
		return EntityType.WITHER_SKELETON;
	}

}
