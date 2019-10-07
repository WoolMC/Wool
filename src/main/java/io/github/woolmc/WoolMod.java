package io.github.woolmc;

import io.github.woolmc.wool.Wool;
import net.fabricmc.api.ModInitializer;

public class WoolMod implements ModInitializer {

	@Override
	public void onInitialize() {
		System.out.println("Wopol");
		Wool.getInstance(); // Initalize server
		
	}

}
