package io.github.woolmc.wool.server.entity.skeleton;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.WitherSkeleton;

import io.github.woolmc.wool.server.entity.WoolMob;
import net.minecraft.entity.mob.WitherSkeletonEntity;

public class WoolWitherSkeleton extends WoolMob implements WitherSkeleton {

	public WoolWitherSkeleton(WitherSkeletonEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public SkeletonType getSkeletonType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSkeletonType(SkeletonType type) {
		// TODO Auto-generated method stub

	}

	@Override
	public EntityType getType() {
		return EntityType.WITHER_SKELETON;
	}

}
