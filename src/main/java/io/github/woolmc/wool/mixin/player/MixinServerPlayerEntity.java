package io.github.woolmc.wool.mixin.player;

import org.bukkit.entity.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.woolmc.wool.server.player.BukkitPlayerAccess;
import io.github.woolmc.wool.server.player.WoolServerPlayer;
import net.minecraft.server.network.ServerPlayerEntity;

@Mixin(ServerPlayerEntity.class)
public class MixinServerPlayerEntity implements BukkitPlayerAccess {
	
	private WoolServerPlayer playerInst;
	@Inject(at = @At("RETURN"), method = "<init>*")
	public void onConstructor(CallbackInfo ci) {
		System.out.println(":rinking:");
		playerInst = new WoolServerPlayer((ServerPlayerEntity)(Object)this);
	}
	
	@Override
	public Player getPlayer() {
		return playerInst;
	}
	
}
