package io.github.woolmc.wool.scheduler;

import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.atomic.AtomicBoolean;

public class StandardWoolTask implements WoolTask {
	static final long NO_REPEAT = -1;
	private static final int NEVER = -2;

	private Plugin plugin; // plugin owner
	Runnable action; // action (runnable)
	private final long period; // time between each call / or NO_REPEAT if non-repeating
	private int id; // the id of this task
	private long delay; // the delay until first execution
	private AtomicBoolean running = new AtomicBoolean(); // if the task is currently in progress
	private boolean async; // if the task is async
	private boolean cancelled; // if the task is cancelled
	private int lastExec = NEVER; // the last tick this task was executed, or NEVER if it was never executed so far

	public StandardWoolTask(Plugin plugin, Runnable action, long delay, long period, boolean async) {
		if(action != null)
			this.action = action;
		this.delay = delay;
		this.period = period;
		this.plugin = plugin;
		this.async = async;
	}


	@Override
	public void exec(int tick) {
		if (delay <= 0 && (period == NO_REPEAT || lastExec == NEVER || (tick - lastExec) % period == 0)) {
			running.set(true);
			try {
				action.run();
			} catch (Exception e) {
				throw new RuntimeException();
			}
			running.set(false);
			lastExec = tick;

		}
		delay--;
	}

	@Override
	public boolean remove() {
		return cancelled || (NO_REPEAT == period && lastExec != NEVER);
	}

	@Override
	public boolean isRunning() {
		return running.get();
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

	@Override
	public void setId(int id) {
		this.id = id;
	}
}
