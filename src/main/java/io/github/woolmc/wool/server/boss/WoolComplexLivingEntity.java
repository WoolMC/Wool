package io.github.woolmc.wool.server.boss;

import java.util.Set;

import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.ComplexLivingEntity;

import io.github.woolmc.wool.server.entity.WoolLivingEntity;
import net.minecraft.entity.LivingEntity;

public abstract class WoolComplexLivingEntity extends WoolLivingEntity implements ComplexLivingEntity {

	protected WoolComplexLivingEntity(LivingEntity handle) { // TODO NMS type
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Set<ComplexEntityPart> getParts() {
		// TODO Auto-generated method stub
		return null;
	}

}
