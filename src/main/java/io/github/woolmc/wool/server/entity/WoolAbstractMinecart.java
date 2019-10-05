package io.github.woolmc.wool.server.entity;

import org.bukkit.block.data.BlockData;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Minecart;
import org.bukkit.material.MaterialData;
import org.bukkit.util.Vector;

import net.minecraft.entity.vehicle.AbstractMinecartEntity;

public abstract class WoolAbstractMinecart extends WoolVehicle implements Minecart {

	public WoolAbstractMinecart(AbstractMinecartEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Vector getDerailedVelocityMod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MaterialData getDisplayBlock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlockData getDisplayBlockData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDisplayBlockOffset() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Vector getFlyingVelocityMod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getMaxSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isSlowWhenEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDamage(double arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDerailedVelocityMod(Vector arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDisplayBlock(MaterialData arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDisplayBlockData(BlockData arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDisplayBlockOffset(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFlyingVelocityMod(Vector arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMaxSpeed(double arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSlowWhenEmpty(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

}
