package io.github.woolmc.wool.server.entity.hostile.illager;

import org.bukkit.block.Block;
import org.bukkit.entity.Raider;

import io.github.woolmc.wool.server.entity.WoolMob;
import net.minecraft.entity.raid.RaiderEntity;

public abstract class WoolRaider extends WoolMob implements Raider {

	protected WoolRaider(RaiderEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Block getPatrolTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPatrolTarget(Block block) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPatrolLeader() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setPatrolLeader(boolean leader) {
		// TODO Auto-generated method stub

	}

}
