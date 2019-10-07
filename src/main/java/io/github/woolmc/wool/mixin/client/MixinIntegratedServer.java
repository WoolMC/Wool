package io.github.woolmc.wool.mixin.client;

import org.bukkit.Server;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.woolmc.wool.BukkitServerAccess;
import io.github.woolmc.wool.Wool;
import net.minecraft.server.integrated.IntegratedServer;

@Mixin(IntegratedServer.class)
public class MixinIntegratedServer implements BukkitServerAccess {
	
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
