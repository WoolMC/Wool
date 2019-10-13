package io.github.woolmc;

import java.io.PrintStream;
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


	/**
	 * Utility class
	 */
	private Sys() {
		Sys.dbg("Debug");
		Sys.err("Error");
		Sys.cfg("Relief");
		Sys.inf("Info");
		Sys.wrn("Warn");
	}

	private static final Logger LOGGER = Logger.getLogger("WoolMC");

	private static Object[] params(String name) {
		StackTraceElement ste = Thread.currentThread().getStackTrace()[3];
		return new Object[]{ste, name};
	}

	/**
	 * Initializes the logger
	 */
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
				stream.printf("[ %s ] as %s\n%s: \"%s\"\n", parameters[0], parameters[1], date, r.getMessage());
			}
		});

	}

	/**
	 * Puts an error message on the consol with the stack trace
	 *
	 * @param info
	 */
	public static void err(String info, Object...params) {
		LOGGER.log(Level.SEVERE, String.format(info, params), params("ERROR"));
	}

	/**
	 * Puts a warn message on the console with the stack trace
	 *
	 * @param info
	 */
	public static void wrn(String info, Object...params) {
		LOGGER.log(Level.WARNING, String.format(info, params), params("WARN"));
	}

	/**
	 * Puts an info message on the console with the stack trace
	 *
	 * @param info
	 */
	public static void inf(String info, Object...params) {
		LOGGER.log(Level.INFO, String.format(info, params), params("INFO"));
	}

	/**
	 * Puts a debug message on the console with the stack trace
	 *
	 * @param info
	 */
	public static void dbg(String info, Object...params) {
		LOGGER.log(Level.FINE, String.format(info, params), params("DEBUG"));
	}

	/**
	 * Puts a config message on the console with the stack trace
	 *
	 * @param info
	 */
	public static void cfg(String info, Object...params) {
		LOGGER.log(Level.CONFIG, String.format(info, params), params("CONFIG"));
	}

}
