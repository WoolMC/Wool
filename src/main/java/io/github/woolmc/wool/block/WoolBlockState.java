package io.github.woolmc.wool.block;

import java.util.List;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.data.BlockData;
import org.bukkit.material.MaterialData;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

public abstract class WoolBlockState implements BlockState {

	@Override
	public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<MetadataValue> getMetadata(String metadataKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasMetadata(String metadataKey) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeMetadata(String metadataKey, Plugin owningPlugin) {
		// TODO Auto-generated method stub

	}

	@Override
	public Block getBlock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MaterialData getData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlockData getBlockData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Material getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte getLightLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public World getWorld() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getZ() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Location getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location getLocation(Location loc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Chunk getChunk() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setData(MaterialData data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBlockData(BlockData data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setType(Material type) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(boolean force) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(boolean force, boolean applyPhysics) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public byte getRawData() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRawData(byte data) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPlaced() {
		// TODO Auto-generated method stub
		return false;
	}

}
