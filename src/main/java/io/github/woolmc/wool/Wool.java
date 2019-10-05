package io.github.woolmc.wool;

import org.bukkit.Bukkit;
import org.bukkit.Server;

import io.github.woolmc.wool.server.WoolServerImpl;

public final class Wool {
	
	private static Wool instance = new Wool();
	private Server server;
	
	private Wool() {}
	
	public static Wool getInstance() {
		return instance;
	}
	
	public WoolServerImpl getServer() {
		return (WoolServerImpl) server;
	}
	
	public void setServer(Server bukkitServerInst) {
		
		if(this.server !=null) {
			
		}
		
		Bukkit.setServer(bukkitServerInst);
		this.server = bukkitServerInst;
	}

	public boolean isClient() {
		// TODO Auto-generated method stub
		return false;
	}
}
