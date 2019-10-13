package io.github.woolmc.wool.config;

public class WoolConfig implements SimpleConfig {
	@YamlPath(path = "scheduler.asyncThreads")
	public int schedulerAsyncThreads = 1;
	@YamlPath(path = "connectionThrottle")
	public long connectionThrottle = 1024;
	@YamlPath(path = "ticksper.animalSpawn")
	public int ticksPerAnimalSpawn = 400;
	@YamlPath(path = "ticksper.nobSpawn")
	public int ticksPerMobSpawn = 1;
}
