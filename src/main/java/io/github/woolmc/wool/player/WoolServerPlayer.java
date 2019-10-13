package io.github.woolmc.wool.player;

import java.net.InetSocketAddress;
import java.util.Map;
import java.util.Set;

import org.bukkit.Achievement;
import org.bukkit.DyeColor;
import org.bukkit.Effect;
import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.Statistic;
import org.bukkit.WeatherType;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementProgress;
import org.bukkit.block.data.BlockData;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;
import org.bukkit.scoreboard.Scoreboard;

import net.minecraft.server.network.ServerPlayerEntity;

public class WoolServerPlayer extends WoolPlayer implements Player {
	
	public WoolServerPlayer(ServerPlayerEntity sPlayerEntity) {
		super(sPlayerEntity);
	}
	
	private ServerPlayerEntity handle;
	
	// IMPL Methods
	
	public ServerPlayerEntity getHandle() {
		return handle;
	}

	@Override
	public boolean isConversing() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void acceptConversationInput(String input) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public boolean beginConversation(Conversation conversation) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void abandonConversation(Conversation conversation) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void abandonConversation(Conversation conversation, ConversationAbandonedEvent details) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public boolean isOnline() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isBanned() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isWhitelisted() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setWhitelisted(boolean value) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public Player getPlayer() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public long getFirstPlayed() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public long getLastPlayed() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean hasPlayedBefore() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Map<String, Object> serialize() {
		throw new UnsupportedOperationException("Unsupported");
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
	public String getDisplayName() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setDisplayName(String name) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public String getPlayerListName() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setPlayerListName(String name) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public String getPlayerListHeader() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public String getPlayerListFooter() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setPlayerListHeader(String header) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setPlayerListFooter(String footer) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setPlayerListHeaderFooter(String header, String footer) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setCompassTarget(Location loc) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public Location getCompassTarget() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public InetSocketAddress getAddress() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void sendRawMessage(String message) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void kickPlayer(String message) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void chat(String msg) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean performCommand(String command) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isSneaking() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setSneaking(boolean sneak) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean isSprinting() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setSprinting(boolean sprinting) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void saveData() {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void loadData() {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setSleepingIgnored(boolean isSleeping) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean isSleepingIgnored() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void playNote(Location loc, byte instrument, byte note) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void playNote(Location loc, Instrument instrument, Note note) {
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
	public void stopSound(Sound sound) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void stopSound(String sound) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void stopSound(Sound sound, SoundCategory category) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void stopSound(String sound, SoundCategory category) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void playEffect(Location loc, Effect effect, int data) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public <T> void playEffect(Location loc, Effect effect, T data) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void sendBlockChange(Location loc, Material material, byte data) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void sendBlockChange(Location loc, BlockData block) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean sendChunkChange(Location loc, int sx, int sy, int sz, byte[] data) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void sendSignChange(Location loc, String[] lines) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void sendSignChange(Location loc, String[] lines, DyeColor dyeColor) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void sendMap(MapView map) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void updateInventory() {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void awardAchievement(Achievement achievement) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void removeAchievement(Achievement achievement) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean hasAchievement(Achievement achievement) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void incrementStatistic(Statistic statistic) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void decrementStatistic(Statistic statistic) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void incrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void decrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setStatistic(Statistic statistic, int newValue) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public int getStatistic(Statistic statistic) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void incrementStatistic(Statistic statistic, Material material) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void decrementStatistic(Statistic statistic, Material material) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public int getStatistic(Statistic statistic, Material material) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void incrementStatistic(Statistic statistic, Material material, int amount) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void decrementStatistic(Statistic statistic, Material material, int amount) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setStatistic(Statistic statistic, Material material, int newValue) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void incrementStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void decrementStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public int getStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void incrementStatistic(Statistic statistic, EntityType entityType, int amount)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void decrementStatistic(Statistic statistic, EntityType entityType, int amount) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setStatistic(Statistic statistic, EntityType entityType, int newValue) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setPlayerTime(long time, boolean relative) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public long getPlayerTime() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public long getPlayerTimeOffset() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isPlayerTimeRelative() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void resetPlayerTime() {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setPlayerWeather(WeatherType type) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public WeatherType getPlayerWeather() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void resetPlayerWeather() {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void giveExp(int amount) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void giveExpLevels(int amount) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public float getExp() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setExp(float exp) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public int getLevel() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setLevel(int level) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public int getTotalExperience() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setTotalExperience(int exp) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public float getExhaustion() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setExhaustion(float value) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public float getSaturation() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setSaturation(float value) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public int getFoodLevel() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setFoodLevel(int value) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean getAllowFlight() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setAllowFlight(boolean flight) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void hidePlayer(Player player) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void hidePlayer(Plugin plugin, Player player) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void showPlayer(Player player) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void showPlayer(Plugin plugin, Player player) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean canSee(Player player) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public boolean isFlying() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setFlying(boolean value) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setFlySpeed(float value) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setWalkSpeed(float value) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public float getFlySpeed() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public float getWalkSpeed() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setTexturePack(String url) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setResourcePack(String url) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setResourcePack(String url, byte[] hash) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public Scoreboard getScoreboard() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setScoreboard(Scoreboard scoreboard) throws IllegalArgumentException, IllegalStateException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public boolean isHealthScaled() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setHealthScaled(boolean scale) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void setHealthScale(double scale) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public double getHealthScale() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public Entity getSpectatorTarget() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setSpectatorTarget(Entity entity) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void sendTitle(String title, String subtitle) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void sendTitle(String title, String subtitle, int fadeIn, int stay, int fadeOut) {
		throw new UnsupportedOperationException("Unsupported");

	}

	@Override
	public void resetTitle() {
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
	public AdvancementProgress getAdvancementProgress(Advancement advancement) {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getClientViewDistance() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public String getLocale() {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void updateCommands() {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public void openBook(ItemStack book) {
		throw new UnsupportedOperationException("Unsupported");
		
	}

	@Override
	public EntityType getType() {
		return EntityType.PLAYER;
	}
}
