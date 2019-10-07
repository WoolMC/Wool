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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void acceptConversationInput(String input) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean beginConversation(Conversation conversation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void abandonConversation(Conversation conversation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abandonConversation(Conversation conversation, ConversationAbandonedEvent details) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isOnline() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBanned() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWhitelisted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setWhitelisted(boolean value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Player getPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getFirstPlayed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getLastPlayed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasPlayedBefore() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, Object> serialize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendPluginMessage(Plugin source, String channel, byte[] message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<String> getListeningPluginChannels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDisplayName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPlayerListName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPlayerListName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPlayerListHeader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPlayerListFooter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPlayerListHeader(String header) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayerListFooter(String footer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayerListHeaderFooter(String header, String footer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCompassTarget(Location loc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Location getCompassTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InetSocketAddress getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendRawMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kickPlayer(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chat(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean performCommand(String command) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSneaking() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSneaking(boolean sneak) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSprinting() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSprinting(boolean sprinting) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSleepingIgnored(boolean isSleeping) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSleepingIgnored() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void playNote(Location loc, byte instrument, byte note) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playNote(Location loc, Instrument instrument, Note note) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playSound(Location location, Sound sound, float volume, float pitch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playSound(Location location, String sound, float volume, float pitch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playSound(Location location, Sound sound, SoundCategory category, float volume, float pitch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playSound(Location location, String sound, SoundCategory category, float volume, float pitch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopSound(Sound sound) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopSound(String sound) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopSound(Sound sound, SoundCategory category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopSound(String sound, SoundCategory category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playEffect(Location loc, Effect effect, int data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void playEffect(Location loc, Effect effect, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendBlockChange(Location loc, Material material, byte data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendBlockChange(Location loc, BlockData block) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean sendChunkChange(Location loc, int sx, int sy, int sz, byte[] data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sendSignChange(Location loc, String[] lines) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSignChange(Location loc, String[] lines, DyeColor dyeColor) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMap(MapView map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void awardAchievement(Achievement achievement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAchievement(Achievement achievement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasAchievement(Achievement achievement) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void incrementStatistic(Statistic statistic) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decrementStatistic(Statistic statistic) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatistic(Statistic statistic, int newValue) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getStatistic(Statistic statistic) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void incrementStatistic(Statistic statistic, Material material) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decrementStatistic(Statistic statistic, Material material) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getStatistic(Statistic statistic, Material material) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void incrementStatistic(Statistic statistic, Material material, int amount) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decrementStatistic(Statistic statistic, Material material, int amount) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatistic(Statistic statistic, Material material, int newValue) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incrementStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decrementStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void incrementStatistic(Statistic statistic, EntityType entityType, int amount)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decrementStatistic(Statistic statistic, EntityType entityType, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatistic(Statistic statistic, EntityType entityType, int newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayerTime(long time, boolean relative) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getPlayerTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getPlayerTimeOffset() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isPlayerTimeRelative() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void resetPlayerTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayerWeather(WeatherType type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WeatherType getPlayerWeather() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void resetPlayerWeather() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void giveExp(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void giveExpLevels(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getExp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setExp(float exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setLevel(int level) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTotalExperience() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTotalExperience(int exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getExhaustion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setExhaustion(float value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getSaturation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSaturation(float value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFoodLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFoodLevel(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getAllowFlight() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAllowFlight(boolean flight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hidePlayer(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hidePlayer(Plugin plugin, Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showPlayer(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showPlayer(Plugin plugin, Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canSee(Player player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFlying() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setFlying(boolean value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFlySpeed(float value) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setWalkSpeed(float value) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getFlySpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getWalkSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTexturePack(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResourcePack(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResourcePack(String url, byte[] hash) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Scoreboard getScoreboard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setScoreboard(Scoreboard scoreboard) throws IllegalArgumentException, IllegalStateException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isHealthScaled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setHealthScaled(boolean scale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHealthScale(double scale) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getHealthScale() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Entity getSpectatorTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSpectatorTarget(Entity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendTitle(String title, String subtitle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendTitle(String title, String subtitle, int fadeIn, int stay, int fadeOut) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetTitle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spawnParticle(Particle particle, Location location, int count) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spawnParticle(Particle particle, double x, double y, double z, int count) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void spawnParticle(Particle particle, Location location, int count, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY,
			double offsetZ) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY,
			double offsetZ, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY,
			double offsetZ, double extra) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ, double extra) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY,
			double offsetZ, double extra, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ, double extra, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AdvancementProgress getAdvancementProgress(Advancement advancement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getClientViewDistance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getLocale() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCommands() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openBook(ItemStack book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntityType getType() {
		return EntityType.PLAYER;
	}
}
