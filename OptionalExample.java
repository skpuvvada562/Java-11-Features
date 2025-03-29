package java11features;

import java.util.Optional;

public class OptionalExample {

	/**
	 * 
	 * @param args Java 11 introduced isEmpty() method in Optional class.
	 */
	public static void main(String[] args) {

		Optional<String> optional = Optional.of("Advaith");
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
	}

}
