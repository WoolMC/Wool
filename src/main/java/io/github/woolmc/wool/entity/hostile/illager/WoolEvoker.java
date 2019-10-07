package io.github.woolmc.wool.entity.hostile.illager;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Evoker;

import net.minecraft.entity.mob.EvokerEntity;

public class WoolEvoker extends WoolSpellcaster implements Evoker {

	protected WoolEvoker(EvokerEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public org.bukkit.entity.Evoker.Spell getCurrentSpell() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCurrentSpell(org.bukkit.entity.Evoker.Spell spell) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntityType getType() {
		return EntityType.EVOKER;
	}

}
