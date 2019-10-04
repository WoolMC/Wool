package io.github.woolmc.wool.server.entity.hostile.illager;

import org.bukkit.entity.Spellcaster;

import net.minecraft.entity.mob.SpellcastingIllagerEntity;

public abstract class WoolSpellcaster extends WoolIllager implements Spellcaster {

	protected WoolSpellcaster(SpellcastingIllagerEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Spell getSpell() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSpell(Spell spell) {
		// TODO Auto-generated method stub

	}

}
