package io.github.woolmc.wool.entity.hostile.illager;

import org.bukkit.block.Block;
import org.bukkit.entity.Raider;

import io.github.woolmc.wool.entity.WoolMob;
import net.minecraft.entity.raid.RaiderEntity;

public abstract class WoolRaider<T extends RaiderEntity> extends WoolMob<T> implements Raider {

	protected WoolRaider(T handle) {
		super(handle);
	}

	@Override
	public Block getPatrolTarget() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setPatrolTarget(Block block) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean isPatrolLeader() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setPatrolLeader(boolean leader) {
		throw new UnsupportedOperationException("Unsupported");

	}

}
