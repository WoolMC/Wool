package io.github.woolmc.wool.config;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;
import java.io.IOException;

public class WoolConfig {
	public int schedulerAsyncThreads = 1;
	public long connectionThrottle = 1024;
	public int ticksPerAnimalSpawn = 400;
	public int ticksPerMobSpawn = 1;


	public void load(File file) {
		YamlConfiguration yml;
		if (file.exists()) {
			yml = new YamlConfiguration();
			try {
				yml.load(file);
			} catch (IOException | InvalidConfigurationException e) {
				e.printStackTrace();
			}
		} else
			yml = save(file);

		// add config loading here
		schedulerAsyncThreads = yml.getInt("scheduler.threads");
	}

	public YamlConfiguration save(File file) {
		try {
			File parent = file.getParentFile();
			if (parent != null && !parent.exists()) parent.mkdirs();

			if (!file.exists()) file.createNewFile();
			YamlConfiguration yml = new YamlConfiguration();

			// add config saving here
			yml.set("scheduler.threads", schedulerAsyncThreads);

			// save file
			yml.save(file);
			return yml;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
