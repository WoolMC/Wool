package io.github.woolmc.wool.world;

import java.util.Collection;

import org.bukkit.Chunk;
import org.bukkit.ChunkSnapshot;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.Plugin;

import net.minecraft.block.entity.BlockEntity;

public class WoolChunk implements Chunk {
	
	private net.minecraft.world.chunk.WorldChunk handle;
	private WoolWorld woolWorld;

	public WoolChunk(WoolWorld woolWorld, net.minecraft.world.chunk.WorldChunk nmsChunk) {
		this.woolWorld = woolWorld;
		this.handle = nmsChunk;
	}
	
	@Override
	public int getX() {
		return getHandle().getPos().x;
	}

	@Override
	public int getZ() {
		return getHandle().getPos().z;
	}

	@Override
	public World getWorld() {
		return woolWorld;
	}

	@Override
	public Block getBlock(int x, int y, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public ChunkSnapshot getChunkSnapshot() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public ChunkSnapshot getChunkSnapshot(boolean includeMaxblocky, boolean includeBiome, boolean includeBiomeTempRain) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Entity[] getEntities() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public BlockState[] getTileEntities() {
		Collection<BlockEntity> list = getHandle().getBlockEntities().values();
		return getHandle().getBlockEntities().values().toArray(new BlockState[list.size()]);
	}

	@Override
	public boolean isLoaded() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean load(boolean generate) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean load() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean unload(boolean save) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean unload() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isSlimeChunk() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isForceLoaded() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setForceLoaded(boolean forced) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public boolean addPluginChunkTicket(Plugin plugin) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean removePluginChunkTicket(Plugin plugin) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Collection<Plugin> getPluginChunkTickets() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public long getInhabitedTime() {
		return getHandle().getInhabitedTime();
	}

	@Override
	public void setInhabitedTime(long ticks) {
		getHandle().setInhabitedTime(ticks);
	}

	@Override
	public boolean contains(BlockData block) {
		throw new UnsupportedOperationException("Unsupported");
	}
	
	public net.minecraft.world.chunk.WorldChunk getHandle() {
		return handle;
	}
	
}
