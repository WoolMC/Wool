package io.github.woolmc.wool.entity.hostile.zombie;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager.Profession;

import io.github.woolmc.wool.entity.WoolMob;

import org.bukkit.entity.Zombie;

import net.minecraft.entity.mob.ZombieEntity;

public class WoolZombie extends WoolMob implements Zombie {

	public WoolZombie(ZombieEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isBaby() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setBaby(boolean flag) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isVillager() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setVillager(boolean flag) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVillagerProfession(Profession profession) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Profession getVillagerProfession() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isConverting() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getConversionTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setConversionTime(int time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntityType getType() {
		return EntityType.ZOMBIE;
	}

}
