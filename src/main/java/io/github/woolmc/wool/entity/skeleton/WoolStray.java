package io.github.woolmc.wool.entity.skeleton;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Stray;

import io.github.woolmc.wool.entity.WoolMob;
import net.minecraft.entity.mob.StrayEntity;

public class WoolStray extends WoolMob<StrayEntity> implements Stray {

	public WoolStray(StrayEntity handle) {
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
		return EntityType.STRAY;
	}

}
