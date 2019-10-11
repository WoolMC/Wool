package io.github.woolmc.wool.scheduler;

import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitTask;
import org.jetbrains.annotations.NotNull;

public class WoolTask implements BukkitTask {
	public static final long NO_REPEAT = -1;
	public static final int NEVER = -2;

	Plugin plugin;
	Runnable action;
	final long period;
	int id;
	long delay;
	volatile boolean running;
	boolean async;
	boolean cancelled;

	private int lastExec = NEVER;

	public WoolTask(Plugin plugin, Runnable action, long delay, long period, boolean async) {
		if(action != null)
			this.action = action;
		this.delay = delay;
		this.period = period;
		this.plugin = plugin;
		this.async = async;
	}

	public void exec(int tick) {
		if (delay <= 0 && (period == NO_REPEAT || lastExec == NEVER || (tick - lastExec) % period == 0)) {
			running = true;
			action.run();
			running = false;
			lastExec = tick;
		}
		delay--;
	}

	public boolean remove() {
		return NO_REPEAT == period && lastExec != NEVER;
	}

	public boolean isRunning() {
		return running;
	}

	@Override
	public int getTaskId() {
		return id;
	}

	@Override
	public @NotNull Plugin getOwner() {
		return plugin;
	}

	@Override
	public boolean isSync() {
		return !async;
	}

	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void cancel() {
		cancelled = true;
	}

	public void setId(int id) {
		this.id = id;
	}
}
