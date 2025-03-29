package java11features;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;

public class HttpClientExample {

	/**
	 * 
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 * Sends a GET request to the specified URL and prints the response.
	 */
	public static void main(String[] args) throws IOException, InterruptedException {

		HttpClient httpClient = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.restful-api.dev/objects")).GET().build();

		HttpResponse<String> response =httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body()); // Prints JSON response
	}
}
