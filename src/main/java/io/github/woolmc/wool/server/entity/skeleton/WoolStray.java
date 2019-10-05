package io.github.woolmc.wool.server.entity.skeleton;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Stray;

import io.github.woolmc.wool.server.entity.WoolMob;
import net.minecraft.entity.mob.StrayEntity;

public class WoolStray extends WoolMob implements Stray {

	public WoolStray(StrayEntity handle) {
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
		return EntityType.STRAY;
	}

}
