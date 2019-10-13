package io.github.woolmc.wool.entity.hostile;

import org.bukkit.entity.Blaze;
import org.bukkit.entity.EntityType;

import io.github.woolmc.wool.entity.WoolMob;
import net.minecraft.entity.mob.BlazeEntity;

public class WoolBlaze extends WoolMob<BlazeEntity> implements Blaze {

	public WoolBlaze(BlazeEntity handle) {
		super(handle);
	}

	@Override
	public EntityType getType() {
		return EntityType.BLAZE;
	}

}
