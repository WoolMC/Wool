package io.github.woolmc.wool.entity.hostile.illager;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Evoker;

import net.minecraft.entity.mob.EvokerEntity;

public class WoolEvoker extends WoolSpellcaster<EvokerEntity> implements Evoker {

	protected WoolEvoker(EvokerEntity handle) {
		super(handle);
	}

	@Override
	public org.bukkit.entity.Evoker.Spell getCurrentSpell() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setCurrentSpell(org.bukkit.entity.Evoker.Spell spell) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public EntityType getType() {
		return EntityType.EVOKER;
	}

}
