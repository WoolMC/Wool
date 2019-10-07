package io.github.woolmc.wool.server.player;

import org.bukkit.entity.Player;

import net.minecraft.server.network.ServerPlayerEntity;

public interface BukkitPlayerAccess {
	public static Player getBukkitPlayer(ServerPlayerEntity nms) {
		return (Player) nms;
	}
	
	public Player getPlayer();
}
