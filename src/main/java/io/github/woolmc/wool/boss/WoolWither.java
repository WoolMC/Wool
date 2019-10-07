package io.github.woolmc.wool.boss;

import org.bukkit.boss.BossBar;
import org.bukkit.entity.Boss;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Wither;

import io.github.woolmc.wool.entity.WoolMob;
import net.minecraft.entity.boss.WitherEntity;

public class WoolWither extends WoolMob implements Wither, Boss {

	protected WoolWither(WitherEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BossBar getBossBar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityType getType() {
		return EntityType.WITHER;
	}

}
