package by.goncharov.task06.util;

public class IdGenerator {
	private static long id;

	private IdGenerator() {
	}

	public static long generateId() {
		return ++id;
	}
	
	public static void reset() {
		id = 0;
	}
}
