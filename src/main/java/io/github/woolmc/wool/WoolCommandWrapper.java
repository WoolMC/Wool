package io.github.woolmc.wool;

import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.ProxiedCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.minecart.CommandMinecart;

import io.github.woolmc.wool.command.sender.ProxiedNativeCommandSender;
import io.github.woolmc.wool.command.sender.WoolCommandBlockSender;
import io.github.woolmc.wool.entity.WoolCommandMinecart;
import io.github.woolmc.wool.player.WoolServerPlayer;
import net.minecraft.server.command.ServerCommandSource;

public class WoolCommandWrapper {
	public static ServerCommandSource getSource(CommandSender sender) {
		if (sender instanceof Player) {
			return ((WoolServerPlayer) sender).getHandle().getCommandSource();
		}
		
		if (sender instanceof BlockCommandSender) {
			return ((WoolCommandBlockSender) sender).getHandle().getCommandExecutor().getSource();
		}
		
		if (sender instanceof CommandMinecart) {
			return ((WoolCommandMinecart) sender).getHandle().getCommandSource();
		}

		if (!Wool.getInstance().isClient()) { // Client incompatible area
			if (sender instanceof ConsoleCommandSender) {
				return ((WoolServerImpl) sender.getServer()).getHandle().getCommandSource();
			}
		}
		
		if (sender instanceof ProxiedCommandSender) {
			return ((ProxiedNativeCommandSender) sender).getHandle();
		}

		throw new IllegalArgumentException("Cannot make " + sender + " a ServerCommandSource");
	}
}
