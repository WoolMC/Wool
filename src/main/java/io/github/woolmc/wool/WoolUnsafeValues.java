package io.github.woolmc.wool;

import io.github.woolmc.WoolMod;
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
import java.util.List;
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
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getDataVersion() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public ItemStack modifyItemStack(ItemStack stack, String arguments) {
		throw new UnsupportedOperationException("Unsupported");
	}

	private static final List<String> SUPPORTED_API = WoolMod.getWoolConfig().supported;

	@Override
	public void checkSupported(PluginDescriptionFile pdf) throws InvalidPluginException {
		int minimumIndex = SUPPORTED_API.indexOf(WoolMod.getWoolConfig().minimumAPI);

		if (pdf.getAPIVersion() != null) {
			int pluginIndex = SUPPORTED_API.indexOf(pdf.getAPIVersion());

			if (pluginIndex == -1) {
				throw new InvalidPluginException("Unsupported API version " + pdf.getAPIVersion());
			}

			if (pluginIndex < minimumIndex) {
				throw new InvalidPluginException("Plugin API version " + pdf.getAPIVersion() + " is lower than the minimum allowed version. Please update or replace it.");
			}
		} else {
			if (minimumIndex == -1) {
				Bukkit.getLogger().log(Level.WARNING, "Plugin " + pdf.getFullName() + " does not specify an api-version.");
			} else {
				throw new InvalidPluginException("Plugin API version " + pdf.getAPIVersion() + " is lower than the minimum allowed version. Please update or replace it.");
			}
		}
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
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean removeAdvancement(NamespacedKey key) {
		throw new UnsupportedOperationException("Unsupported");
	}

}
