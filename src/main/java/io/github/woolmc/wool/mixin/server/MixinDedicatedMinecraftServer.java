package io.github.woolmc.wool.mixin.server;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.server.dedicated.MinecraftDedicatedServer;
import net.minecraft.server.dedicated.ServerCommandOutput;

@Mixin(MinecraftDedicatedServer.class)
public interface MixinDedicatedMinecraftServer {
	@Accessor
	public ServerCommandOutput getRconCommandOutput();
	
}
