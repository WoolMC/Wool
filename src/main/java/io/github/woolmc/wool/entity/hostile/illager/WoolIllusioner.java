package io.github.woolmc.wool.entity.hostile.illager;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Illusioner;

import net.minecraft.entity.mob.IllusionerEntity;

public class WoolIllusioner extends WoolSpellcaster<IllusionerEntity> implements Illusioner {

	protected WoolIllusioner(IllusionerEntity handle) {
		super(handle);
	}

	@Override
	public EntityType getType() {
		return EntityType.ILLUSIONER;
	}

}
