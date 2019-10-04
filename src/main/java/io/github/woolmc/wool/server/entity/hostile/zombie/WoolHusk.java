package io.github.woolmc.wool.server.entity.hostile.zombie;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Husk;
import org.bukkit.entity.Villager.Profession;

import io.github.woolmc.wool.server.entity.WoolMob;
import net.minecraft.entity.mob.HuskEntity;

public class WoolHusk extends WoolMob implements Husk {

	public WoolHusk(HuskEntity handle) {
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
		return EntityType.HUSK;
	}

}
