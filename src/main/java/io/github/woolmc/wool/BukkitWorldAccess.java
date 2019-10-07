package io.github.woolmc.wool;

import org.bukkit.World;

public interface BukkitWorldAccess {

	static World getWorld(net.minecraft.world.World world) {
		return ((BukkitWorldAccess) world).getWorld();
	}

	World getWorld();
}
