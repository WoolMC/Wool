package io.github.woolmc.wool.mixin.server;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.server.MinecraftServer;

@Mixin(MinecraftServer.class)
public class MixinMinecraftServer$Brand {
	/**
	 * A bit dangerous eh? I don't care to be honest.
	 */
	@Overwrite
	public String getServerModName() {
        return "fabric-wool";
    }
}
