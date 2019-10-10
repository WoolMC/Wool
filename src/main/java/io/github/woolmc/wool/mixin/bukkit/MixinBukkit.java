package io.github.woolmc.wool.mixin.bukkit;

import io.github.woolmc.wool.Wool;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static org.bukkit.Bukkit.*;

@Mixin(Bukkit.class)
public class MixinBukkit {

	@Shadow(remap = false)
	private static Server server;

	/**
	 * Allows the mod to work client
	 * @param param the server being set
	 * @param info the information
	 */
	@Inject(method = "setServer(Lorg/bukkit/Server;)V", at = @At("HEAD"), cancellable = true, remap = false)
	private static void setServer(Server param, CallbackInfo info) {
		if (server != null && !Wool.getInstance().isClient()) {
			throw new UnsupportedOperationException("Can't redefine a singleton server");
		}

		server = param;
		server.getLogger().info("This server is running " + getName() + " version " + getVersion() + " (Implementing API version " + getBukkitVersion() + ")");
		info.cancel();
	}
}
