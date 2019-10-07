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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inventory getEnderChest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MainHand getMainHand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setWindowProperty(Property prop, int value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public InventoryView getOpenInventory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InventoryView openInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InventoryView openWorkbench(Location location, boolean force) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InventoryView openEnchanting(Location location, boolean force) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void openInventory(InventoryView inventory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InventoryView openMerchant(Villager trader, boolean force) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InventoryView openMerchant(Merchant merchant, boolean force) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemStack getItemInHand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setItemInHand(ItemStack item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemStack getItemOnCursor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setItemOnCursor(ItemStack item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasCooldown(Material material) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getCooldown(Material material) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCooldown(Material material, int ticks) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSleepTicks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Location getBedSpawnLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBedSpawnLocation(Location location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBedSpawnLocation(Location location, boolean force) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean sleep(Location location, boolean force) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void wakeup(boolean setSpawnLocation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Location getBedLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameMode getGameMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setGameMode(GameMode mode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isBlocking() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHandRaised() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getExpToLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean discoverRecipe(NamespacedKey recipe) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int discoverRecipes(Collection<NamespacedKey> recipes) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean undiscoverRecipe(NamespacedKey recipe) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int undiscoverRecipes(Collection<NamespacedKey> recipes) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Entity getShoulderEntityLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setShoulderEntityLeft(Entity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Entity getShoulderEntityRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setShoulderEntityRight(Entity entity) {
		// TODO Auto-generated method stub
		
	}

}
