package io.github.woolmc.wool;

import org.bukkit.Server;

import io.github.woolmc.wool.server.WoolServerImpl;
import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.server.MinecraftServer;

public final class Wool {
	
	private static Wool instance = new Wool();
	private Server server;
	
	private Wool() {}
	
	public static Wool getInstance() {
		return instance;
	}
	
	public WoolServerImpl getBukkitServer() {
		return (WoolServerImpl) server;
	}
	
	public MinecraftServer getNMSServer() {
		return ((WoolServerImpl) server).getHandle();
	}
	
	public void setServer(Server bukkitServerInst) {
		
		if(this.server !=null) {
			
		}
		this.server = bukkitServerInst;
	}

	public boolean isClient() {
		return FabricLoader.getInstance().getEnvironmentType()==EnvType.CLIENT;
	}
}
