package io.github.woolmc.wool.server.entity.hostile.zombie;

import org.bukkit.entity.Drowned;
import org.bukkit.entity.Villager.Profession;

import io.github.woolmc.wool.server.entity.WoolMob;

public class WoolDrowned extends WoolMob implements Drowned {

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

}
