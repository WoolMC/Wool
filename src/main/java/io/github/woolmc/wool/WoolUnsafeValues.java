package io.github.woolmc.wool;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.UnsafeValues;
import org.bukkit.advancement.Advancement;
import org.bukkit.block.data.BlockData;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.InvalidPluginException;
import org.bukkit.plugin.PluginDescriptionFile;

public class WoolUnsafeValues implements UnsafeValues {

	@Override
	public Material toLegacy(Material material) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Material fromLegacy(Material material) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Material fromLegacy(MaterialData material) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Material fromLegacy(MaterialData material, boolean itemPriority) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlockData fromLegacy(Material material, byte data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Material getMaterial(String material, int version) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDataVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ItemStack modifyItemStack(ItemStack stack, String arguments) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void checkSupported(PluginDescriptionFile pdf) throws InvalidPluginException {
		// TODO Auto-generated method stub

	}

	@Override
	public byte[] processClass(PluginDescriptionFile pdf, String path, byte[] clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Advancement loadAdvancement(NamespacedKey key, String advancement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAdvancement(NamespacedKey key) {
		// TODO Auto-generated method stub
		return false;
	}

}