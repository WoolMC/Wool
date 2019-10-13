package io.github.woolmc.wool.boss;

import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.ComplexLivingEntity;

import io.github.woolmc.wool.entity.WoolEntity;
import net.minecraft.entity.Entity;

public abstract class WoolComplexEntityPart extends WoolEntity implements ComplexEntityPart {

	protected WoolComplexEntityPart(Entity handle) {
		super(handle);
	}

	@Override
	public ComplexLivingEntity getParent() {
		throw new UnsupportedOperationException("Unsupported");
	}

}
