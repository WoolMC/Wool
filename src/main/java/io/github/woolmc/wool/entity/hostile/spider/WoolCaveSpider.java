package io.github.woolmc.wool.entity.hostile.spider;

import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.EntityType;

import io.github.woolmc.wool.entity.WoolMob;
import net.minecraft.entity.mob.CaveSpiderEntity;

public class WoolCaveSpider extends WoolMob<CaveSpiderEntity> implements CaveSpider {

	protected WoolCaveSpider(CaveSpiderEntity handle) {
		super(handle);
	}

	@Override
	public EntityType getType() {
		return EntityType.CAVE_SPIDER;
	}

}
