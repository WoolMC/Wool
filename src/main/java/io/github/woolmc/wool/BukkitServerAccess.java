package io.github.woolmc.wool;

import org.bukkit.Server;

import net.minecraft.server.MinecraftServer;

public interface BukkitServerAccess {
	
	public static Server getServer(MinecraftServer nmsServer) {
		return ((BukkitServerAccess) nmsServer).getBukkitServer();
	}
	
	public Server getBukkitServer();
}
