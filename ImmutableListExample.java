package java11features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImmutableListExample {

	/**
	 * 
	 * @param args
	 * Java 11 allows you to collect elements into an unmodifiable list.
	 * Why important? ✅ Ensures immutability in concurrent environments.
	 */

	public static void main(String[] args) {

		List<String> list = Stream.of("Java", "11", "Features").collect(Collectors.toUnmodifiableList());
		System.out.println(list); // [Java, 11, Features]
		list.add("New"); // Throws UnsupportedOperationException
	}

}
