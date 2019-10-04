package io.github.woolmc.wool.server.boss;

import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.ComplexLivingEntity;

import io.github.woolmc.wool.server.entity.WoolEntity;
import net.minecraft.entity.Entity;

public abstract class WoolComplexEntityPart extends WoolEntity implements ComplexEntityPart {

	protected WoolComplexEntityPart(Entity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ComplexLivingEntity getParent() {
		// TODO Auto-generated method stub
		return null;
	}

}
