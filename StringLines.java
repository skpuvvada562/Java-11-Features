package java11features;

import java.util.Arrays;

public class StringLines {

	/**
	 * 
	 * @param args
	 * Splits a string into lines and returns array
	 */
	public static void main(String[] args) {

		
		String multiLines="Hi Advaith Ram How are you ?";
		String[] data = multiLines.lines().toArray(String[]::new);
		System.out.println(Arrays.toString(data));
	}

}
