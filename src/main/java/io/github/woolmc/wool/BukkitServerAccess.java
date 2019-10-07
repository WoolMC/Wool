package io.github.woolmc.wool;

import org.bukkit.Server;

import net.minecraft.server.MinecraftServer;

public interface BukkitServerAccess {
	
	public static Server getServer(MinecraftServer nmsServer) {
		return (Server) nmsServer;
	}
	
	public Server getBukkitServer();
}
