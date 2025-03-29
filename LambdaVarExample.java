package java11features;

import java.util.Arrays;
import java.util.List;

public class LambdaVarExample {

	/**
	 * 
	 * @param args Iterate through the list of strings using lambda expression.
	 * Java 11 allows using var inside lambda expressions.
	 */
	public static void main(String[] args) {
		
		List<String> data = Arrays.asList("Advaith","Ram","Mamatha");
		data.forEach((var name) -> System.out.println(name));
		

	}

}
