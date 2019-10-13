package io.github.woolmc.wool.boss;

import java.util.Set;

import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.ComplexLivingEntity;

import io.github.woolmc.wool.entity.WoolLivingEntity;
import net.minecraft.entity.LivingEntity;

public abstract class WoolComplexLivingEntity extends WoolLivingEntity implements ComplexLivingEntity {

	protected WoolComplexLivingEntity(LivingEntity handle) { // TODO NMS type
		super(handle);
	}

	@Override
	public Set<ComplexEntityPart> getParts() {
		throw new UnsupportedOperationException("Unsupported");
	}

}
