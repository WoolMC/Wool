package io.github.woolmc.wool.entity;

import net.minecraft.block.PortalBlock;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Minecart;
import org.bukkit.material.MaterialData;
import org.bukkit.util.Vector;

import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import org.jetbrains.annotations.NotNull;

public abstract class WoolAbstractMinecart<T extends AbstractMinecartEntity> extends WoolVehicle<T> implements Minecart {

	public WoolAbstractMinecart(T handle) {
		super(handle);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public double getDamage() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@NotNull
	@Override
	public Vector getDerailedVelocityMod() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@NotNull
	@Override
	public MaterialData getDisplayBlock() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@NotNull
	@Override
	public BlockData getDisplayBlockData() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getDisplayBlockOffset() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Vector getFlyingVelocityMod() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public double getMaxSpeed() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isSlowWhenEmpty() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setDamage(double arg0) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void setDerailedVelocityMod(Vector arg0) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void setDisplayBlock(MaterialData arg0) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void setDisplayBlockData(BlockData arg0) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void setDisplayBlockOffset(int arg0) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void setFlyingVelocityMod(Vector arg0) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void setMaxSpeed(double arg0) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void setSlowWhenEmpty(boolean arg0) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

}
