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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChunkSnapshot getChunkSnapshot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChunkSnapshot getChunkSnapshot(boolean includeMaxblocky, boolean includeBiome, boolean includeBiomeTempRain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity[] getEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlockState[] getTileEntities() {
		Collection<BlockEntity> list = getHandle().getBlockEntities().values();
		return getHandle().getBlockEntities().values().toArray(new BlockState[list.size()]);
	}

	@Override
	public boolean isLoaded() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean load(boolean generate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean load() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unload(boolean save) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unload() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSlimeChunk() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isForceLoaded() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setForceLoaded(boolean forced) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addPluginChunkTicket(Plugin plugin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removePluginChunkTicket(Plugin plugin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<Plugin> getPluginChunkTickets() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return false;
	}
	
	public net.minecraft.world.chunk.WorldChunk getHandle() {
		return handle;
	}
	
}
