package io.github.woolmc.wool.entity.skeleton;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Skeleton;

import io.github.woolmc.wool.entity.WoolMob;
import net.minecraft.entity.mob.SkeletonEntity;

public class WoolSkeleton extends WoolMob<SkeletonEntity> implements Skeleton {

	public WoolSkeleton(SkeletonEntity handle) {
		super(handle);
	}

	@Override
	public SkeletonType getSkeletonType() {
		return SkeletonType.NORMAL;
	}

	@Override
	public void setSkeletonType(SkeletonType type) {
		throw new UnsupportedOperationException("Not supported.");
	}

	@Override
	public EntityType getType() {
		return EntityType.SKELETON;
	}

}
