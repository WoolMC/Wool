package io.github.woolmc.wool.server.entity;

import org.bukkit.entity.Mob;
import org.bukkit.loot.LootTable;

public abstract class WoolMob extends WoolLivingEntity implements Mob {

	@Override
	public void setLootTable(LootTable table) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LootTable getLootTable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSeed(long seed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getSeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTarget(org.bukkit.entity.LivingEntity target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public org.bukkit.entity.LivingEntity getTarget() {
		// TODO Auto-generated method stub
		return null;
	}

}
