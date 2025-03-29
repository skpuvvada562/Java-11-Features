package java11features;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceEnhancement {

	/**
	 * 
	 * @param args
	 * If a resource is already declared outside, you can use it inside try-with-resources.
	 * Why important? ✅ Less boilerplate code, better readability.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        try (reader) {
            System.out.println(reader.readLine());
        } // No need to declare `reader` again
	}

}
