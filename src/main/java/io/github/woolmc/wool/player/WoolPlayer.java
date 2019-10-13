package io.github.woolmc.wool.player;

import java.util.Collection;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.InventoryView.Property;

import io.github.woolmc.wool.entity.WoolLivingEntity;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MainHand;
import org.bukkit.inventory.Merchant;
import org.bukkit.inventory.PlayerInventory;

import net.minecraft.entity.player.PlayerEntity;

public abstract class WoolPlayer extends WoolLivingEntity implements HumanEntity {

	protected WoolPlayer(PlayerEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PlayerInventory getInventory() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Inventory getEnderChest() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public MainHand getMainHand() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean setWindowProperty(Property prop, int value) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public InventoryView getOpenInventory() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public InventoryView openInventory(Inventory inventory) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public InventoryView openWorkbench(Location location, boolean force) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public InventoryView openEnchanting(Location location, boolean force) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void openInventory(InventoryView inventory) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public InventoryView openMerchant(Villager trader, boolean force) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public InventoryView openMerchant(Merchant merchant, boolean force) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void closeInventory() {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public ItemStack getItemInHand() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setItemInHand(ItemStack item) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public ItemStack getItemOnCursor() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setItemOnCursor(ItemStack item) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public boolean hasCooldown(Material material) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getCooldown(Material material) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setCooldown(Material material, int ticks) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public int getSleepTicks() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Location getBedSpawnLocation() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setBedSpawnLocation(Location location) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void setBedSpawnLocation(Location location, boolean force) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public boolean sleep(Location location, boolean force) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void wakeup(boolean setSpawnLocation) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public Location getBedLocation() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public GameMode getGameMode() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setGameMode(GameMode mode) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public boolean isBlocking() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isHandRaised() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getExpToLevel() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean discoverRecipe(NamespacedKey recipe) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int discoverRecipes(Collection<NamespacedKey> recipes) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean undiscoverRecipe(NamespacedKey recipe) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int undiscoverRecipes(Collection<NamespacedKey> recipes) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Entity getShoulderEntityLeft() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setShoulderEntityLeft(Entity entity) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public Entity getShoulderEntityRight() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setShoulderEntityRight(Entity entity) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

}
