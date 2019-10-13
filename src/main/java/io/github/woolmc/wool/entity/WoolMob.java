package io.github.woolmc.wool.entity;

import net.minecraft.entity.LivingEntity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.loot.LootTable;

public abstract class WoolMob<T extends LivingEntity> extends WoolLivingEntity<T> implements Mob {

	protected WoolMob(T handle) {
		super(handle);
	}

	@Override
	public void setLootTable(LootTable table) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public LootTable getLootTable() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setSeed(long seed) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public long getSeed() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setTarget(org.bukkit.entity.LivingEntity target) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public org.bukkit.entity.LivingEntity getTarget() {
		throw new UnsupportedOperationException("Unsupported");
	}

}
