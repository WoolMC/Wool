package io.github.woolmc.wool.mixin.server;

import org.bukkit.Server;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.woolmc.wool.Wool;
import io.github.woolmc.wool.server.BukkitServerAccess;
import net.minecraft.server.MinecraftServer;

@Mixin(MinecraftServer.class)
public class MixinMinecraftDedicatedServer implements BukkitServerAccess {
	
	@Inject(method = "loadWorld(Ljava/lang/String;Ljava/lang/String;JLnet/minecraft/world/level/LevelGeneratorType;Lcom/google/gson/JsonElement;)V", at = @At(value = "HEAD"))
	private void beforeWorldLoad(CallbackInfo ci) {
		// TODO load plugins
		System.out.println("===Load plugins===");
	}
	
	@Override
	public Server getBukkitServer() {
		return Wool.getInstance().getBukkitServer();
	}
}