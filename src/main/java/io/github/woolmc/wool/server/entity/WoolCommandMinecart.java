package io.github.woolmc.wool.server.entity;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.minecart.CommandMinecart;

import net.minecraft.entity.vehicle.CommandBlockMinecartEntity;
import net.minecraft.entity.vehicle.MinecartEntity;

public class WoolCommandMinecart extends WoolAbstractMinecart implements CommandMinecart {

	public WoolCommandMinecart(CommandBlockMinecartEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCommand() {
		return getHandle().getCommandExecutor().getCommand();
	}

	@Override
	public void setCommand(String arg0) {
		getHandle().getCommandExecutor().setCommand(arg0);
	}

	@Override
	public void setName(String arg0) {
		getHandle().getCommandExecutor().setCustomName(text_1); // TODO TextUtil
	}

	@Override
	public EntityType getType() {
		return EntityType.MINECART_COMMAND;
	}
	
	// IMPL methods
	
	public CommandBlockMinecartEntity getHandle() {
		return (CommandBlockMinecartEntity) handle;
	}

}
