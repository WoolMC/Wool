package io.github.woolmc.wool.entity;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.minecart.CommandMinecart;

import io.github.woolmc.wool.String2TextUtil;
import net.minecraft.entity.vehicle.CommandBlockMinecartEntity;
import net.minecraft.entity.vehicle.MinecartEntity;

public class WoolCommandMinecart extends WoolAbstractMinecart<CommandBlockMinecartEntity> implements CommandMinecart {

	public WoolCommandMinecart(CommandBlockMinecartEntity handle) {
		super(handle);
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
		getHandle().getCommandExecutor().setCustomName(String2TextUtil.fromStringOrNull(arg0));
	}

	@Override
	public EntityType getType() {
		return EntityType.MINECART_COMMAND;
	}

}
