package io.github.woolmc.wool.server.entity.hostile.illager;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Illusioner;

import net.minecraft.entity.mob.IllusionerEntity;

public class WoolIllusioner extends WoolSpellcaster implements Illusioner {

	protected WoolIllusioner(IllusionerEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public EntityType getType() {
		return EntityType.ILLUSIONER;
	}

}
