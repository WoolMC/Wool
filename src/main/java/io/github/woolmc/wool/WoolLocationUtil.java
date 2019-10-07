package io.github.woolmc.wool;

import org.bukkit.Location;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;

public class WoolLocationUtil {
	public static Location fromBlockPos(World world, Vec3i blockPos) {
		return new Location(BukkitWorldAccess.getWorld(world), blockPos.getX(), blockPos.getY(), blockPos.getZ());
	}
	
	public static Location fromBlockPos(World world, Vec3d vec3d) {
		return new Location(BukkitWorldAccess.getWorld(world), vec3d.getX(), vec3d.getY(), vec3d.getZ());
	}
	
	public static Vec3d toVec3d(Location location) {
		return new Vec3d(location.getX(), location.getY(), location.getZ());
	}
	
	public static Vec3i toVec3i(Location location) {
		return new Vec3i(location.getX(), location.getY(), location.getZ());
	}
	
	public static BlockPos toBlockPos(Location location) {
		return new BlockPos(location.getX(), location.getY(), location.getZ());
	}
	
	public static ChunkPos toChunkPos(Location location) {
		return new ChunkPos(toBlockPos(location));
	}
}
