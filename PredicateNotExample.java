package java11features;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotExample {

	/**
	 * 
	 * @param args Filter the list of strings which are not blank.
	 * Java 11 introduced the Predicate.not() method to negate predicates more cleanly.
	 */
	public static void main(String[] args) {
		List<String> list = List.of("Java", "  ", "11", " ");
        List<String> filteredList = list.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList());
        System.out.println(filteredList);
	}
}
