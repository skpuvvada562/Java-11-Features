package java11features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandling {

	/**
	 * 
	 * @param args
	 * @throws IOException Creates a temporary file and writes content to it Reads
	 *                     the content from the file and prints it.
	 */
	public static void main(String[] args) throws IOException {
		Path path=Files.createTempFile("temp",".txt");
		Files.writeString(path, "Hello, World Advaith Ram Mamatha!");
		String content=Files.readString(path);
		System.out.println(content);
	}
}
