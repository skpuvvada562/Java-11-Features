package java11features;

public class StringConcatExample {

	/**
	 * 
	 * @param args Java 11 optimizes String concatenation internally using
	 *             invokedynamic. What changed? Before Java 9: Used StringBuilder.append()
	 * 
	 *             Java 11: Uses dynamic call sites (invokedynamic), which reduces
	 *             memory footprint and improves performance.
	 */
	public static void main(String[] args) {
		 String result = "Java" + 11 + "Features";
	        System.out.println(result);
	}

}
