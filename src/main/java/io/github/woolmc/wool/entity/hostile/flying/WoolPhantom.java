package io.github.woolmc.wool.entity.hostile.flying;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Phantom;

import net.minecraft.entity.mob.PhantomEntity;

public class WoolPhantom extends WoolFlyingEntity<PhantomEntity> implements Phantom {

	public WoolPhantom(PhantomEntity handle) {
		super(handle);
	}

	@Override
	public int getSize() {
		return getHandle().getPhantomSize();
	}

	@Override
	public void setSize(int sz) {
		getHandle().setPhantomSize(sz);
	}
	
	@Override
	public EntityType getType() {
		return EntityType.PHANTOM;
	}
	
}
