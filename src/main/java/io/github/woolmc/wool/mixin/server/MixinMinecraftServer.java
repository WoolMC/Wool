package io.github.woolmc.wool.mixin.server;

import com.google.gson.JsonElement;
import io.github.woolmc.wool.BukkitServerAccess;
import io.github.woolmc.wool.Wool;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.LevelGeneratorType;
import org.bukkit.Server;
import org.bukkit.plugin.PluginLoadOrder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class MixinMinecraftServer implements BukkitServerAccess {
	
	@Inject(method = "loadWorld(Ljava/lang/String;Ljava/lang/String;JLnet/minecraft/world/level/LevelGeneratorType;Lcom/google/gson/JsonElement;)V", at = @At("HEAD"))
	private void beforeWorldLoad(String string_1, String string_2, long long_1, LevelGeneratorType levelGeneratorType_1, JsonElement jsonElement_1, CallbackInfo ci) {
		System.out.println("== Server load plugins ==");
		Wool.getInstance().getBukkitServer().loadPlugins();
		Wool.getInstance().getBukkitServer().enablePlugins(PluginLoadOrder.STARTUP);
		Wool.getInstance().getBukkitServer().enablePlugins(PluginLoadOrder.POSTWORLD);
		System.out.println("===Load plugins===");
	}
	
	@Override
	public Server getBukkitServer() {
		return Wool.getInstance().getBukkitServer();
	}
}
