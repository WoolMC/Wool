package io.github.woolmc.wool;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.*;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.github.woolmc.WoolMod;
import io.github.woolmc.wool.player.WoolServerPlayer;
import io.github.woolmc.wool.scheduler.WoolScheduler;
import io.github.woolmc.wool.scheduler.WoolSchedulerImpl;
import io.github.woolmc.wool.world.WoolWorld;
import net.minecraft.world.dimension.DimensionType;
import org.apache.commons.lang.Validate;
import org.bukkit.BanList;
import org.bukkit.BanList.Type;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Keyed;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.StructureType;
import org.bukkit.Tag;
import org.bukkit.UnsafeValues;
import org.bukkit.Warning.WarningState;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.advancement.Advancement;
import org.bukkit.block.data.BlockData;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.boss.KeyedBossBar;
import org.bukkit.command.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.generator.ChunkGenerator.ChunkData;
import org.bukkit.help.HelpMap;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFactory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Merchant;
import org.bukkit.inventory.Recipe;
import org.bukkit.loot.LootTable;
import org.bukkit.map.MapView;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.*;
import org.bukkit.plugin.java.JavaPluginLoader;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.plugin.messaging.StandardMessenger;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.util.CachedServerIcon;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import io.github.woolmc.wool.entity.BukkitEntityAccess;
import io.github.woolmc.wool.player.BukkitPlayerAccess;
import net.minecraft.command.arguments.EntityArgumentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.potion.Potions;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.OperatorEntry;
import net.minecraft.server.PlayerManager;
import net.minecraft.server.ServerConfigEntry;
import org.jetbrains.annotations.NotNull;

public class WoolServerImpl implements Server {
	
	private final MinecraftServer nmsServer;
	private final Logger logger = Logger.getLogger("Wool");
	
	private final ServicesManager servicesManager = new SimpleServicesManager();
	private File update = new File("");
	private UnsafeValues unsafe = new WoolUnsafeValues();
	// private final SimpleHelpMap helpMap = new SimpleHelpMap(this); // CB TODO

    private final StandardMessenger messenger = new StandardMessenger();
	private PlayerManager playerManager;
	private final SimpleCommandMap simpleCommandMap = new SimpleCommandMap(this);
	private final SimplePluginManager pluginManager = new SimplePluginManager(this, simpleCommandMap);
	private final WoolSchedulerImpl scheduler = new WoolSchedulerImpl();

	
	public WoolServerImpl(MinecraftServer handle, PlayerManager playerManager) {
		this.nmsServer = handle;
		this.playerManager = playerManager;
		
		System.out.println("Starting Wool Server");

		Wool.getInstance().setServer(this);
		Bukkit.setServer(this); // Not client friendly
		// Register all the Enchantments and PotionTypes now so we can stop new registration immediately after
        Enchantments.SHARPNESS.getClass();
        org.bukkit.enchantments.Enchantment.stopAcceptingRegistrations();

        // Potion.setPotionBrewer(new CraftPotionBrewer()); // CB TODO
        Potions.HARMING.getClass();
        PotionEffectType.stopAcceptingRegistrations();
        // Ugly hack :(
	}
	
	@Override
	public void sendPluginMessage(Plugin source, String channel, byte[] message) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Set<String> getListeningPluginChannels() {
		throw new UnsupportedOperationException("unsupported");
	}

	@Override
	public String getName() {
		return WoolConstants.NAME;
	}

	@Override
	public String getVersion() {
		return WoolConstants.VERSION;
	}

	@Override
	public String getBukkitVersion() {
		return WoolConstants.BUKKIT_API_VERSION;
	}

	@Override
	public Collection<? extends Player> getOnlinePlayers() {
		return Lists.transform(playerManager.getPlayerList(), (nms -> BukkitPlayerAccess.getBukkitPlayer(nms)));
	}

	@Override
	public int getMaxPlayers() {
		return getHandle().getMaxPlayerCount();
	}

	@Override
	public int getPort() {
		return getHandle().getServerPort();
	}

	@Override
	public int getViewDistance() {
		return getHandle().getPlayerManager().getViewDistance();
	}

	@Override
	public String getIp() {
		return getHandle().getServerIp();
	}

	@Override
	public String getWorldType() {
		return getHandle().getWorld(DimensionType.OVERWORLD).getGeneratorType().getName().toUpperCase();
	}

	@Override
	public boolean getGenerateStructures() {
		return getHandle().shouldGenerateStructures();
	}

	@Override
	public boolean getAllowEnd() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean getAllowNether() {
		return getHandle().isNetherAllowed();
	}

	@Override
	public boolean hasWhitelist() {
		return getHandle().isWhitelistEnabled();
	}

	@Override
	public void setWhitelist(boolean newValue) {
        playerManager.setWhitelistEnabled(newValue);
		getHandle().setWhitelistEnabled(newValue);
	}

	@Override
	public Set<OfflinePlayer> getWhitelistedPlayers() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void reloadWhitelist() {
		getHandle().getPlayerManager().reloadWhitelist();
	}

	@Override
	public int broadcastMessage(String message) {
		getHandle().sendMessage(String2TextUtil.fromStringOrNull(message));
		return 1;
	}


	@Override
	public String getUpdateFolder() {
		return update.toString();
	}

	@Override
	public File getUpdateFolderFile() {
		return update;
	}

	@Override
	public long getConnectionThrottle() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getTicksPerAnimalSpawns() {
		return WoolMod.getWoolConfig().ticksPerAnimalSpawn;
	}

	@Override
	public int getTicksPerMonsterSpawns() {
		return WoolMod.getWoolConfig().ticksPerMobSpawn;
	}

	@Override
	public Player getPlayer(String name) {

		Player found = getPlayerExact(name);
		
		if(found != null) {
			return found;
		}
		
		String lowerName = name.toLowerCase(java.util.Locale.ENGLISH);
        int delta = Integer.MAX_VALUE;
        for (Player player : getOnlinePlayers()) {
            if (player.getName().toLowerCase(java.util.Locale.ENGLISH).startsWith(lowerName)) {
                int curDelta = Math.abs(player.getName().length() - lowerName.length());
                if (curDelta < delta) {
                    found = player;
                    delta = curDelta;
                }
                if (curDelta == 0) break;
            }
        }
        return found;
	}

	@Override
	public Player getPlayerExact(String name) {
		return new WoolServerPlayer(getHandle().getPlayerManager().getPlayer(name));
	}

	@Override
	public List<Player> matchPlayer(String partialName) {
		Validate.notNull(partialName, "PartialName cannot be null");

        List<Player> matchedPlayers = new ArrayList<>();

        for (Player iterPlayer : this.getOnlinePlayers()) {
            String iterPlayerName = iterPlayer.getName();

            if (partialName.equalsIgnoreCase(iterPlayerName)) {
                // Exact match
                matchedPlayers.clear();
                matchedPlayers.add(iterPlayer);
                break;
            }
            if (iterPlayerName.toLowerCase(java.util.Locale.ENGLISH).contains(partialName.toLowerCase(java.util.Locale.ENGLISH))) {
                // Partial match
                matchedPlayers.add(iterPlayer);
            }
        }
        
        return matchedPlayers;

	}

	@Override
	public Player getPlayer(@NotNull UUID id) {
		return BukkitPlayerAccess.getBukkitPlayer(playerManager.getPlayer(id));
	}

	@NotNull
	@Override
	public PluginManager getPluginManager() {
		return pluginManager;
	}

	@NotNull
	@Override
	public WoolScheduler getScheduler() {
		return scheduler;
	}

	@NotNull
	@Override
	public ServicesManager getServicesManager() {
		return servicesManager;
	}

	@NotNull
	@Override
	public List<World> getWorlds() {
		return Collections.EMPTY_LIST;
	}

	@Override
	public World createWorld(@NotNull WorldCreator creator) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean unloadWorld(@NotNull String name, boolean save) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean unloadWorld(@NotNull World world, boolean save) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public World getWorld(@NotNull String name) {
		DimensionType type;
		switch (name) {
			case "world": type = DimensionType.OVERWORLD; break;
			case "world_nether": type = DimensionType.THE_NETHER; break;
			case "world_end": type = DimensionType.THE_END; break;
			default: throw new UnsupportedOperationException(name+" custom worlds not supported");
		}
		return BukkitWorldAccess.getWorld(getHandle().getWorld(type));
	}

	@Override
	public World getWorld(@NotNull UUID uid) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public MapView getMap(int id) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public MapView createMap(World world) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public ItemStack createExplorerMap(World world, Location location, StructureType structureType) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public ItemStack createExplorerMap(World world, Location location, StructureType structureType, int radius,
			boolean findUnexplored) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void reload() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void reloadData() {
		getHandle().reload();
	}

	@Override
	public Logger getLogger() {
		return logger;
	}

	@Override
	public PluginCommand getPluginCommand(String name) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void savePlayers() {
		getHandle().getPlayerManager().saveAllPlayerData();
	}

	@Override
	public boolean dispatchCommand(CommandSender sender, String commandLine) throws CommandException {
		return false;
		//return getHandle().getCommandManager().execute(serverCommandSource_1, string_1); // TODO finish
	}

	@Override
	public boolean addRecipe(Recipe recipe) {
		throw new UnsupportedOperationException("Unsupported");
		// TODO accessor on getHandle().getRecipeManager().recipeMap <- bukkit recipe
	}

	@Override
	public List<Recipe> getRecipesFor(ItemStack result) {
		throw new UnsupportedOperationException("Unsupported");
		// TODO accessor on getHandle().getRecipeManager().recipeMap -> Bukkit recipes and filter
	}

	@Override
	public Iterator<Recipe> recipeIterator() {
		throw new UnsupportedOperationException("Unsupported");
		// TODO getHandle().getRecipeManager().values(); -> Bukkit Recipes
	}

	@Override
	public void clearRecipes() {
		throw new UnsupportedOperationException("Unsupported");
		// TODO accessor on getHandle().getRecipeManager().recipeMap
	}

	@Override
	public void resetRecipes() {
		throw new UnsupportedOperationException("Unsupported");
		// TODO accessor on getHandle().getRecipeManager().recipeMap
	}

	@Override
	public Map<String, String[]> getCommandAliases() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getSpawnRadius() {
		return getHandle().getSpawnRadius(getHandle().getWorld(DimensionType.OVERWORLD));
	}

	@Override
	public void setSpawnRadius(int value) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean getOnlineMode() {
		return getHandle().isOnlineMode();
	}

	@Override
	public boolean getAllowFlight() {
		return getHandle().isFlightEnabled();
	}

	@Override
	public boolean isHardcore() {
		return getHandle().isHardcore();
	}

	@Override
	public void shutdown() {
		getHandle().stop(false);
	}

	@Override
	public int broadcast(String message, String permission) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public OfflinePlayer getOfflinePlayer(String name) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public OfflinePlayer getOfflinePlayer(UUID id) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public Set<String> getIPBans() {
		return new HashSet<String>(Arrays.asList(getHandle().getPlayerManager().getIpBanList().getNames()));
	}

	@Override
	public void banIP(String address) {
        Validate.notNull(address, "Address cannot be null.");
		this.getBanList(org.bukkit.BanList.Type.IP).addBan(address, null, null, null);
	}

	@Override
	public void unbanIP(String address) {
        Validate.notNull(address, "Address cannot be null.");
        this.getBanList(org.bukkit.BanList.Type.IP).pardon(address);
	}

	@Override
	public Set<OfflinePlayer> getBannedPlayers() {
		Set<OfflinePlayer> result = new HashSet<OfflinePlayer>();

        for (ServerConfigEntry<com.mojang.authlib.GameProfile> entry : getHandle().getPlayerManager().getUserBanList().values()) {
            // result.add(getOfflinePlayer((GameProfile) entry.getName())); TODO
        }

        return result;
	}

	@Override
	public BanList getBanList(Type type) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public Set<OfflinePlayer> getOperators() {
		Set<OfflinePlayer> result = new HashSet<OfflinePlayer>();

        for (OperatorEntry entry : getHandle().getPlayerManager().getOpList().values()) {
            //result.add(getOfflinePlayer((GameProfile) entry.getName())); TODO
        }

        return result;
	}

	@Override
	public GameMode getDefaultGameMode() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setDefaultGameMode(GameMode mode) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public ConsoleCommandSender getConsoleSender() {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public File getWorldContainer() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public OfflinePlayer[] getOfflinePlayers() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Messenger getMessenger() {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public HelpMap getHelpMap() {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public Inventory createInventory(InventoryHolder owner, InventoryType type) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public Inventory createInventory(InventoryHolder owner, InventoryType type, String title) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public Inventory createInventory(InventoryHolder owner, int size) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public Inventory createInventory(InventoryHolder owner, int size, String title) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public Merchant createMerchant(String title) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public int getMonsterSpawnLimit() {
		return WoolMod.getWoolConfig().hostileMobCap;
	}

	@Override
	public int getAnimalSpawnLimit() {
		return WoolMod.getWoolConfig().animalMobCap;
	}

	@Override
	public int getWaterAnimalSpawnLimit() {
		return WoolMod.getWoolConfig().waterMobCap;
	}

	@Override
	public int getAmbientSpawnLimit() {
		return WoolMod.getWoolConfig().ambientMobCap;
	}

	@Override
	public boolean isPrimaryThread() {
		return getHandle().getThread() == Thread.currentThread();
	}

	@Override
	public String getMotd() {
		return getHandle().getServerMotd();
	}

	@Override
	public String getShutdownMessage() {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public WarningState getWarningState() {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public ItemFactory getItemFactory() {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public ScoreboardManager getScoreboardManager() {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public CachedServerIcon getServerIcon() {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public CachedServerIcon loadServerIcon(File file) throws IllegalArgumentException, Exception {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public CachedServerIcon loadServerIcon(BufferedImage image) throws IllegalArgumentException, Exception {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void setIdleTimeout(int threshold) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getIdleTimeout() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public ChunkData createChunkData(World world) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public BossBar createBossBar(String title, BarColor color, BarStyle style, BarFlag... flags) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public KeyedBossBar createBossBar(NamespacedKey key, String title, BarColor color, BarStyle style,
			BarFlag... flags) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public Iterator<KeyedBossBar> getBossBars() {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public KeyedBossBar getBossBar(NamespacedKey key) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public boolean removeBossBar(NamespacedKey key) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Entity getEntity(UUID uuid) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public Advancement getAdvancement(NamespacedKey key) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public Iterator<Advancement> advancementIterator() {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public BlockData createBlockData(Material material) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public BlockData createBlockData(Material material, Consumer<BlockData> consumer) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public BlockData createBlockData(String data) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public BlockData createBlockData(Material material, String data) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public <T extends Keyed> Tag<T> getTag(String registry, NamespacedKey tag, Class<T> clazz) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public <T extends Keyed> Iterable<Tag<T>> getTags(String registry, Class<T> clazz) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public LootTable getLootTable(NamespacedKey key) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public List<Entity> selectEntities(CommandSender sender, String selector) throws IllegalArgumentException {
		Preconditions.checkArgument(selector != null, "Selector cannot be null");
        Preconditions.checkArgument(sender != null, "Sender cannot be null");

        EntityArgumentType arg = EntityArgumentType.entities();
        List<? extends net.minecraft.entity.Entity> nms;

        try {
            StringReader reader = new StringReader(selector);
            nms = arg.parse(reader).getEntities(WoolCommandWrapper.getSource(sender));
            Preconditions.checkArgument(!reader.canRead(), "Spurious trailing data in selector: " + selector);
        } catch (CommandSyntaxException ex) {
            throw new IllegalArgumentException("Could not parse selector: " + selector, ex);
        }

        return new ArrayList<>(Lists.transform(nms, (entity) -> BukkitEntityAccess.getEntity(entity)));
	}

	@Override
	public UnsafeValues getUnsafe() {
		return unsafe;
	}
	
	// IMPL Methods
	
	public MinecraftServer getHandle() {
		return nmsServer;
	}

	public void enablePlugins(PluginLoadOrder type) {
		Plugin[] plugins = pluginManager.getPlugins();

		for (Plugin plugin : plugins) {
			if ((!plugin.isEnabled()) && (plugin.getDescription().getLoad() == type)) {
				enablePlugin(plugin);
			}
		}
	}

	private void enablePlugin(Plugin plugin) {
		try {
			List<Permission> perms = plugin.getDescription().getPermissions();

			for (Permission perm : perms) {
				try {
					pluginManager.addPermission(perm, false);
				} catch (IllegalArgumentException ex) {
					getLogger().log(Level.WARNING, "Plugin " + plugin.getDescription().getFullName() + " tried to register permission '" + perm.getName() + "' but it's already registered", ex);
				}
			}
			pluginManager.dirtyPermissibles();

			pluginManager.enablePlugin(plugin);
		} catch (Throwable ex) {
			Logger.getLogger(WoolServerImpl.class.getName()).log(Level.SEVERE, ex.getMessage() + " loading " + plugin.getDescription().getFullName() + " (Is it up to date?)", ex);
		}
	}

	public void loadPlugins() {
		pluginManager.registerInterface(JavaPluginLoader.class);

		File pluginFolder = new File("plugins");

		if (pluginFolder.exists()) {
			Plugin[] plugins = pluginManager.loadPlugins(pluginFolder);
			for (Plugin plugin : plugins) {
				try {
					String message = String.format("Loading %s", plugin.getDescription().getFullName());
					plugin.getLogger().info(message);
					plugin.onLoad();
				} catch (Throwable ex) {
					Logger.getLogger(WoolServerImpl.class.getName()).log(Level.SEVERE, ex.getMessage() + " initializing " + plugin.getDescription().getFullName() + " (Is it up to date?)", ex);
				}
			}
		} else {
			pluginFolder.mkdir();
		}
	}


	public void disablePlugins() {
		pluginManager.disablePlugins();
	}

}
