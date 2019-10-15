package io.github.woolmc;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * For logging and debugging, helps because it shows the recent stack trace so u can see where the print statement was
 *
 * @author devan
 */
public class Sys {

	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("hh:mm:ss");

	/**
	 * Utility class
	 */
	private Sys() {
		Sys.err("Error");
		Sys.wrn("Warn");
		Sys.dbg("Debug");
		Sys.cfg("Config");
		Sys.inf("Info");
	}

	private static final Logger LOGGER = Logger.getLogger("WoolMC");

	private static Object[] params(String name) {
		Thread thread = Thread.currentThread();
		StackTraceElement ste = thread.getStackTrace()[3];
		return new Object[]{ste, name, thread.getName()};
	}

	static {
		LOGGER.setLevel(Level.FINEST);
		LOGGER.setUseParentHandlers(false);
		LOGGER.addHandler(new Handler() {

			@Override
			public void close() {
				/* useless */
			}

			@Override
			public void flush() {
				/* useless */
			}


			@Override
			public void publish(LogRecord r) {
				Level l = r.getLevel();
				PrintStream stream;
				if (l.intValue() >= Level.WARNING.intValue())
					stream = System.err;
				else
					stream = System.out;

				Date date = Date.from(Instant.now());
				Object[] parameters = r.getParameters();
				stream.printf("[ %s ]\n[%s] [%s/%s]: \"%s\"\n", parameters[0], DATE_FORMAT.format(date), parameters[2], parameters[1], r.getMessage());
			}
		});

	}

	/**
	 * Puts an error message on the consol with the stack trace
	 *
	 * @param info message
	 */
	public static void err(String info, Object...params) {
		LOGGER.log(Level.SEVERE, String.format(info, params), params("ERROR"));
	}

	/**
	 * Puts a warn message on the console with the stack trace
	 *
	 * @param info the message
	 */
	public static void wrn(String info, Object...params) {
		LOGGER.log(Level.WARNING, String.format(info, params), params("WARN"));
	}

	/**
	 * Puts an info message on the console with the stack trace
	 *
	 * @param info the message
	 */
	public static void inf(String info, Object...params) {
		LOGGER.log(Level.INFO, String.format(info, params), params("INFO"));
	}

	/**
	 * Puts a debug message on the console with the stack trace
	 *
	 * @param info the message
	 */
	public static void dbg(String info, Object...params) {
		LOGGER.log(Level.FINE, String.format(info, params), params("DEBUG"));
	}

	/**
	 * Puts a config message on the console with the stack trace
	 *
	 * @param info the message
	 */
	public static void cfg(String info, Object...params) {
		LOGGER.log(Level.CONFIG, String.format(info, params), params("CONFIG"));
	}

}
