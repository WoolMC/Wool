package io.github.woolmc;

import io.github.woolmc.wool.Wool;
import net.fabricmc.api.ModInitializer;
import org.bukkit.Bukkit;

public class WoolMod implements ModInitializer {

	@Override
	public void onInitialize() {
		Sys.dbg("Hello!");
		Wool.getInstance(); // Initalize server
	}

}
