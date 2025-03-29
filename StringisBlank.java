package java11features;

public class StringisBlank {
	/**
	 * 
	 * @param args
	 * Checks if a string is empty or contains only white spaces.
	 */
	public static void main(String[] args) {

		String str = " ";
		String str1 = "Hello";
		System.out.println(str.isBlank());
		System.out.println(str1.isBlank());	
		
	}

}
