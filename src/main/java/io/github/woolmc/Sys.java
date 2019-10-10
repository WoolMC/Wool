package io.github.woolmc;

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
		Sys.gud("Relief");
		Sys.inf("Info");
		Sys.wrn("Warn");
	}

	private static final Logger LOGGER = Logger.getLogger("WoolMC");

	private static Object[] params() {
		StackTraceElement ste = Thread.currentThread().getStackTrace()[3];
		return new Object[]{ste.getFileName(), ste.getLineNumber()};
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
				/* dunno what this does */
			}

			@Override
			public void flush() {
				/* dunno what this does */
			}

			@Override
			public void publish(LogRecord r) {
				Level l = r.getLevel();
				if (l.intValue() != Level.SEVERE.intValue())
					System.out.printf("(%s:%d) -> %s : %s\n", r.getParameters()[0], (Integer) r.getParameters()[1], l.toString(), r.getMessage());
				else
					System.err.printf("(%s:%d) -> %s : %s\n", r.getParameters()[0], (Integer) r.getParameters()[1], l.toString(), r.getMessage());
			}
		});

	}

	/**
	 * Puts an error message on the consol with the stack trace
	 *
	 * @param info
	 */
	public static void err(String info, Object...params) {
		LOGGER.log(Level.SEVERE, String.format(info, params), params());
	}

	/**
	 * Puts an warn message on the consol with the stack trace
	 *
	 * @param info
	 */
	public static void wrn(String info, Object...params) {
		LOGGER.log(Level.WARNING, String.format(info, params), params());
	}

	/**
	 * Puts an info message on the consol with the stack trace
	 *
	 * @param info
	 */
	public static void inf(String info, Object...params) {
		LOGGER.log(Level.INFO, String.format(info, params), params());
	}

	/**
	 * Puts an debug message on the consol with the stack trace
	 *
	 * @param info
	 */
	public static void dbg(String info, Object...params) {
		LOGGER.log(Level.CONFIG, String.format(info, params), params());
	}

	/**
	 * Puts an relief message on the consol with the stack trace
	 *
	 * @param info
	 */
	public static void gud(String info, Object...params) {
		LOGGER.log(Level.FINE, String.format(info, params), params());
	}

}
