package io.github.woolmc.wool;

import io.github.woolmc.wool.util.Commodore;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.UnsafeValues;
import org.bukkit.advancement.Advancement;
import org.bukkit.block.data.BlockData;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.InvalidPluginException;
import org.bukkit.plugin.PluginDescriptionFile;
import java.util.logging.Level;

public class WoolUnsafeValues implements UnsafeValues {

	@Override
	public Material toLegacy(Material material) {
		return Material.valueOf(Material.LEGACY_PREFIX+material.name());
	}

	@Override
	public Material fromLegacy(Material material) {
		return Material.valueOf(material.name().replaceAll(Material.LEGACY_PREFIX, ""));
	}

	@Override
	public Material fromLegacy(MaterialData material) {
		return material.getItemType();
	}

	@Override
	public Material fromLegacy(MaterialData material, boolean itemPriority) {
		return material.getItemType();
	}

	@Override
	public BlockData fromLegacy(Material material, byte data) {
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
		try {
			clazz = Commodore.convert(clazz, pdf.getAPIVersion() != null);
		} catch (Exception ex) {
			Bukkit.getLogger().log(Level.SEVERE, "Fatal error trying to convert " + pdf.getFullName() + ":" + path, ex);
		}

		return clazz;
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
