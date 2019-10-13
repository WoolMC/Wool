package io.github.woolmc.wool.config;

public class WoolConfig implements SimpleConfig {
	@YamlPath(path = "scheduler.asyncThreads")
	public int schedulerAsyncThreads = 1;

	@YamlPath(path = "ticks-per.animalSpawn")
	public int ticksPerAnimalSpawn = 400; // TODO implement
	@YamlPath(path = "ticks-per.mobSpawn")
	public int ticksPerMobSpawn = 1; // TODO implement
	@YamlPath(path = "ticks-per.autosave")
	public int autosave = 6000; // TODO implement

	@YamlPath(path = "mobcap.hostile")
	public int hostileMobCap = 70; // TODO implement
	@YamlPath(path = "mobcap.animal")
	public int animalMobCap = 10; // TODO implement
	@YamlPath(path = "mobcap.water")
	public int waterMobCap = 15; // TODO implement
	@YamlPath(path = "mobcap.ambient")
	public int ambientMobCap = 15; // TODO implement


}
