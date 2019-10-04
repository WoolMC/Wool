package io.github.woolmc.wool.server.entity.hostile.flying;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Phantom;

import net.minecraft.entity.mob.PhantomEntity;

public class WoolPhantom extends WoolFlyingEntity implements Phantom {

	public WoolPhantom(PhantomEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
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

	private PhantomEntity getHandle() {
		return (PhantomEntity) this.handle;
	}
	
}
