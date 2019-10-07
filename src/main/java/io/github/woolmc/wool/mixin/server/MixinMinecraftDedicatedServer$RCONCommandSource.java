package io.github.woolmc.wool.mixin.server;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.server.dedicated.MinecraftDedicatedServer;
import net.minecraft.server.dedicated.ServerCommandOutput;

@Environment(EnvType.SERVER)
@Mixin(MinecraftDedicatedServer.class)
public interface MixinMinecraftDedicatedServer$RCONCommandSource {
	@Accessor
	public ServerCommandOutput getRconCommandOutput();
}
