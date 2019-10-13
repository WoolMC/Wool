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
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public List<MetadataValue> getMetadata(String metadataKey) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean hasMetadata(String metadataKey) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void removeMetadata(String metadataKey, Plugin owningPlugin) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public Block getBlock() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public MaterialData getData() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public BlockData getBlockData() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Material getType() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public byte getLightLevel() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public World getWorld() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getX() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getY() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getZ() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Location getLocation() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Location getLocation(Location loc) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Chunk getChunk() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setData(MaterialData data) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setBlockData(BlockData data) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setType(Material type) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean update() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean update(boolean force) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean update(boolean force, boolean applyPhysics) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public byte getRawData() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setRawData(byte data) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean isPlaced() {
		throw new UnsupportedOperationException("Unsupported");
	}

}
