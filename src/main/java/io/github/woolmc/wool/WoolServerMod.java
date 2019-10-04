package io.github.woolmc.wool;

import net.fabricmc.api.DedicatedServerModInitializer;

public class WoolServerMod implements DedicatedServerModInitializer {

	@Override
	public void onInitializeServer() {
		Wool.getInstance(); // Initalize server
		
	}

}
