package io.github.woolmc.wool.entity.hostile.zombie;

import org.bukkit.entity.Drowned;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager.Profession;

import io.github.woolmc.wool.entity.WoolMob;
import net.minecraft.entity.mob.DrownedEntity;

public class WoolDrowned extends WoolMob<DrownedEntity> implements Drowned {

	public WoolDrowned(DrownedEntity handle) {
		super(handle);
	}

	@Override
	public boolean isBaby() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setBaby(boolean flag) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean isVillager() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setVillager(boolean flag) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setVillagerProfession(Profession profession) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public Profession getVillagerProfession() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isConverting() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getConversionTime() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setConversionTime(int time) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public EntityType getType() {
		return EntityType.DROWNED;
	}

}
