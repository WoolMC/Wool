package io.github.woolmc.wool.world;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;


import io.github.woolmc.wool.mixin.util.ServerWorldAccessor;
import org.bukkit.BlockChangeDelegate;
import org.bukkit.Chunk;
import org.bukkit.ChunkSnapshot;
import org.bukkit.Difficulty;
import org.bukkit.Effect;
import org.bukkit.FluidCollisionMode;
import org.bukkit.GameRule;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Raid;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.StructureType;
import org.bukkit.TreeType;
import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.WorldType;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.AbstractArrow;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Item;
import org.bukkit.entity.LightningStrike;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.Consumer;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;

import com.google.common.collect.Lists;

import io.github.woolmc.wool.entity.BukkitEntityAccess;
import io.github.woolmc.wool.player.BukkitPlayerAccess;
import net.minecraft.server.world.ServerWorld;

public class WoolWorld implements World {
	
	private ServerWorld handle;

	public WoolWorld(ServerWorld sWorld) {
		this.handle = sWorld;
	}
	
	@Override
	public void sendPluginMessage(Plugin source, String channel, byte[] message) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public Set<String> getListeningPluginChannels() {
		throw new UnsupportedOperationException("Unsupported");
	}

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
	public Block getBlockAt(int x, int y, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Block getBlockAt(Location location) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getHighestBlockYAt(int x, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getHighestBlockYAt(Location location) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Block getHighestBlockAt(int x, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Block getHighestBlockAt(Location location) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Chunk getChunkAt(int x, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Chunk getChunkAt(Location location) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Chunk getChunkAt(Block block) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isChunkLoaded(Chunk chunk) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Chunk[] getLoadedChunks() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void loadChunk(Chunk chunk) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean isChunkLoaded(int x, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isChunkGenerated(int x, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isChunkInUse(int x, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void loadChunk(int x, int z) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean loadChunk(int x, int z, boolean generate) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean unloadChunk(Chunk chunk) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean unloadChunk(int x, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean unloadChunk(int x, int z, boolean save) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean unloadChunkRequest(int x, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean regenerateChunk(int x, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean refreshChunk(int x, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isChunkForceLoaded(int x, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setChunkForceLoaded(int x, int z, boolean forced) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public Collection<Chunk> getForceLoadedChunks() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean addPluginChunkTicket(int x, int z, Plugin plugin) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean removePluginChunkTicket(int x, int z, Plugin plugin) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void removePluginChunkTickets(Plugin plugin) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public Collection<Plugin> getPluginChunkTickets(int x, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Map<Plugin, Collection<Chunk>> getPluginChunkTickets() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Item dropItem(Location location, ItemStack item) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Item dropItemNaturally(Location location, ItemStack item) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Arrow spawnArrow(Location location, Vector direction, float speed, float spread) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public <T extends AbstractArrow> T spawnArrow(Location location, Vector direction, float speed, float spread,
			Class<T> clazz) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean generateTree(Location location, TreeType type) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean generateTree(Location loc, TreeType type, BlockChangeDelegate delegate) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Entity spawnEntity(Location loc, EntityType type) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public LightningStrike strikeLightning(Location loc) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public LightningStrike strikeLightningEffect(Location loc) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public List<Entity> getEntities() {
		List<Entity> list = new ArrayList<Entity>();

        for (Object o : ((ServerWorldAccessor) getHandle()).getEntitiesById().values()) { // TODO accessor
            if (o instanceof net.minecraft.entity.Entity) {
            	net.minecraft.entity.Entity mcEnt = (net.minecraft.entity.Entity) o;
                Entity bukkitEntity = BukkitEntityAccess.getEntity(mcEnt);

                // Assuming that bukkitEntity isn't null
                if (bukkitEntity != null && bukkitEntity.isValid()) {
                    list.add(bukkitEntity);
                }
            }
        }

        return list;
	}

	@Override
	public List<LivingEntity> getLivingEntities() {
		List<LivingEntity> list = new ArrayList<LivingEntity>();

        for (Object o : ((ServerWorldAccessor) getHandle()).getEntitiesById().values()) { // TODO accessor
            if (o instanceof net.minecraft.entity.Entity) {
            	net.minecraft.entity.Entity mcEnt = (net.minecraft.entity.Entity) o;
                Entity bukkitEntity = BukkitEntityAccess.getEntity(mcEnt);

                // Assuming that bukkitEntity isn't null
                if (bukkitEntity != null && bukkitEntity instanceof LivingEntity && bukkitEntity.isValid()) {
                    list.add((LivingEntity) bukkitEntity);
                }
            }
        }
        
        return list;
	}

	@Override
	public <T extends Entity> Collection<T> getEntitiesByClass(Class<T>... classes) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public <T extends Entity> Collection<T> getEntitiesByClass(Class<T> cls) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Collection<Entity> getEntitiesByClasses(Class<?>... classes) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public List<Player> getPlayers() {
		return Lists.transform(getHandle().getPlayers(), (serverPlayerEntity) -> BukkitPlayerAccess.getBukkitPlayer(serverPlayerEntity));
	}

	@Override
	public Collection<Entity> getNearbyEntities(Location location, double x, double y, double z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Collection<Entity> getNearbyEntities(Location location, double x, double y, double z,
			Predicate<Entity> filter) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Collection<Entity> getNearbyEntities(BoundingBox boundingBox) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Collection<Entity> getNearbyEntities(BoundingBox boundingBox, Predicate<Entity> filter) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public RayTraceResult rayTraceEntities(Location start, Vector direction, double maxDistance) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public RayTraceResult rayTraceEntities(Location start, Vector direction, double maxDistance, double raySize) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public RayTraceResult rayTraceEntities(Location start, Vector direction, double maxDistance,
			Predicate<Entity> filter) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public RayTraceResult rayTraceEntities(Location start, Vector direction, double maxDistance, double raySize,
			Predicate<Entity> filter) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public RayTraceResult rayTraceBlocks(Location start, Vector direction, double maxDistance) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public RayTraceResult rayTraceBlocks(Location start, Vector direction, double maxDistance,
			FluidCollisionMode fluidCollisionMode) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public RayTraceResult rayTraceBlocks(Location start, Vector direction, double maxDistance,
			FluidCollisionMode fluidCollisionMode, boolean ignorePassableBlocks) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public RayTraceResult rayTrace(Location start, Vector direction, double maxDistance, FluidCollisionMode fluidCollisionMode, boolean ignorePassableBlocks, double raySize, Predicate<Entity> filter) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public String getName() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public UUID getUID() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Location getSpawnLocation() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean setSpawnLocation(Location location) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean setSpawnLocation(int x, int y, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public long getTime() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setTime(long time) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public long getFullTime() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setFullTime(long time) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean hasStorm() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setStorm(boolean hasStorm) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public int getWeatherDuration() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setWeatherDuration(int duration) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean isThundering() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setThundering(boolean thundering) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public int getThunderDuration() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setThunderDuration(int duration) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean createExplosion(double x, double y, double z, float power) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean createExplosion(double x, double y, double z, float power, boolean setFire) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean createExplosion(double x, double y, double z, float power, boolean setFire, boolean breakBlocks) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean createExplosion(double x, double y, double z, float power, boolean setFire, boolean breakBlocks,
			Entity source) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean createExplosion(Location loc, float power) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean createExplosion(Location loc, float power, boolean setFire) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean createExplosion(Location loc, float power, boolean setFire, boolean breakBlocks) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean createExplosion(Location loc, float power, boolean setFire, boolean breakBlocks, Entity source) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Environment getEnvironment() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public long getSeed() {
		return getHandle().getSeed();
	}

	@Override
	public boolean getPVP() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setPVP(boolean pvp) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public ChunkGenerator getGenerator() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void save() {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public List<BlockPopulator> getPopulators() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public <T extends Entity> T spawn(Location location, Class<T> clazz) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public <T extends Entity> T spawn(Location location, Class<T> clazz, Consumer<T> function)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public FallingBlock spawnFallingBlock(Location location, MaterialData data) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public FallingBlock spawnFallingBlock(Location location, BlockData data) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public FallingBlock spawnFallingBlock(Location location, Material material, byte data)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void playEffect(Location location, Effect effect, int data) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void playEffect(Location location, Effect effect, int data, int radius) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public <T> void playEffect(Location location, Effect effect, T data) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public <T> void playEffect(Location location, Effect effect, T data, int radius) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public ChunkSnapshot getEmptyChunkSnapshot(int x, int z, boolean includeBiome, boolean includeBiomeTemp) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setSpawnFlags(boolean allowMonsters, boolean allowAnimals) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean getAllowAnimals() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean getAllowMonsters() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Biome getBiome(int x, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setBiome(int x, int z, Biome bio) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public double getTemperature(int x, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public double getHumidity(int x, int z) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getMaxHeight() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getSeaLevel() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean getKeepSpawnInMemory() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setKeepSpawnInMemory(boolean keepLoaded) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean isAutoSave() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setAutoSave(boolean value) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setDifficulty(Difficulty difficulty) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public Difficulty getDifficulty() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public File getWorldFolder() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public WorldType getWorldType() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean canGenerateStructures() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public long getTicksPerAnimalSpawns() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setTicksPerAnimalSpawns(int ticksPerAnimalSpawns) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public long getTicksPerMonsterSpawns() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setTicksPerMonsterSpawns(int ticksPerMonsterSpawns) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public int getMonsterSpawnLimit() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setMonsterSpawnLimit(int limit) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public int getAnimalSpawnLimit() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setAnimalSpawnLimit(int limit) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public int getWaterAnimalSpawnLimit() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setWaterAnimalSpawnLimit(int limit) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public int getAmbientSpawnLimit() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setAmbientSpawnLimit(int limit) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void playSound(Location location, Sound sound, float volume, float pitch) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void playSound(Location location, String sound, float volume, float pitch) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void playSound(Location location, Sound sound, SoundCategory category, float volume, float pitch) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void playSound(Location location, String sound, SoundCategory category, float volume, float pitch) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public String[] getGameRules() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public String getGameRuleValue(String rule) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean setGameRuleValue(String rule, String value) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isGameRule(String rule) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public <T> T getGameRuleValue(GameRule<T> rule) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public <T> T getGameRuleDefault(GameRule<T> rule) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public <T> boolean setGameRule(GameRule<T> rule, T newValue) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public WorldBorder getWorldBorder() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void spawnParticle(Particle particle, Location location, int count) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void spawnParticle(Particle particle, double x, double y, double z, int count) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public <T> void spawnParticle(Particle particle, Location location, int count, T data) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, T data) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY,
			double offsetZ) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public <T> void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY,
			double offsetZ, T data) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ, T data) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY,
			double offsetZ, double extra) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ, double extra) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public <T> void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY,
			double offsetZ, double extra, T data) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ, double extra, T data) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public <T> void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY,
			double offsetZ, double extra, T data, boolean force) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ, double extra, T data, boolean force) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public Location locateNearestStructure(Location origin, StructureType structureType, int radius,
			boolean findUnexplored) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Raid locateNearestRaid(Location location, int radius) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public List<Raid> getRaids() {
		throw new UnsupportedOperationException("Unsupported");
	}
	
	// IMPL methods
	
	public ServerWorld getHandle() {
		return this.handle;
	}
	
}
