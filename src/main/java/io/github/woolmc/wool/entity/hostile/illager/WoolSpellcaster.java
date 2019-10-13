package io.github.woolmc.wool.entity.hostile.illager;

import org.bukkit.entity.Spellcaster;

import net.minecraft.entity.mob.SpellcastingIllagerEntity;

public abstract class WoolSpellcaster<T extends SpellcastingIllagerEntity> extends WoolIllager<T> implements Spellcaster {

	protected WoolSpellcaster(T handle) {
		super(handle);
	}

	@Override
	public Spell getSpell() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setSpell(Spell spell) {
		throw new UnsupportedOperationException("Unsupported");

	}

}
