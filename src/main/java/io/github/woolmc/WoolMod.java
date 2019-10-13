package io.github.woolmc;

import io.github.woolmc.wool.Wool;
import io.github.woolmc.wool.config.SimpleConfig;
import io.github.woolmc.wool.config.WoolConfig;
import io.github.woolmc.wool.scheduler.WoolScheduler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.world.WorldTickCallback;
import java.io.File;

public class WoolMod implements ModInitializer {
	private WoolConfig config;
	private static WoolMod instance;

	@Override
	public void onInitialize() {
		Sys.dbg("Hello!");
		instance = this;
		config = new WoolConfig();
		config.load(new File("wool.yml"));
		Wool.getInstance(); // Initalize server
		// Initialize scheduler ticking
		WorldTickCallback.EVENT.register(s -> ((WoolScheduler)Wool.getInstance().getBukkitServer().getScheduler()).tick(s.getServer().getTicks()));
	}

	public static WoolMod getInstance() {
		return instance;
	}

	public static WoolConfig getWoolConfig() {
		return getInstance().config;
	}

	public SimpleConfig getConfig() {
		return config;
	}
}
