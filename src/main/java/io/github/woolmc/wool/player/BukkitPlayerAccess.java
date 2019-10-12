package io.github.woolmc.wool.player;

import org.bukkit.entity.Player;

import net.minecraft.server.network.ServerPlayerEntity;

public interface BukkitPlayerAccess {
	static Player getBukkitPlayer(ServerPlayerEntity nms) {
		return (Player) nms;
	}
	
	 Player getPlayer();
}
