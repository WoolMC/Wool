package io.github.woolmc.wool.entity.hostile.spider;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Spider;

import io.github.woolmc.wool.entity.WoolMob;
import net.minecraft.entity.mob.SpiderEntity;

public class WoolSpider extends WoolMob implements Spider {

	protected WoolSpider(SpiderEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public EntityType getType() {
		return EntityType.SPIDER;
	}

}
