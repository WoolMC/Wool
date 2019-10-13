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
	}

	@Override
	public BossBar getBossBar() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public EntityType getType() {
		return EntityType.WITHER;
	}

}
