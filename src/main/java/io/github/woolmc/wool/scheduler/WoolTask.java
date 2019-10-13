package io.github.woolmc.wool.scheduler;

import org.bukkit.scheduler.BukkitTask;

public interface WoolTask extends BukkitTask {
	void exec(int tick);
	boolean remove();
	boolean isRunning();
	void setId(int id);
	void cancel();
}
