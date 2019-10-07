package io.github.woolmc.wool.mixin.common;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.woolmc.wool.WoolServerImpl;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.PlayerManager;

@Mixin(PlayerManager.class)
public class MixinPlayerManager {
	
	@Shadow
	private MinecraftServer server;
	
	@Inject(at = @At("RETURN"), method = "<init>*")
	private void onConstructed(CallbackInfo ci) {
		WoolServerImpl wool = new WoolServerImpl(server, (PlayerManager) (Object) this);
	}
}
