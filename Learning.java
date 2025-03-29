package java11features;

public class Learning {

	/**
	 * 
	 * @param args Running Java Files Without Compilation Java 11 allows executing
	 *             single-file programs without explicitly compiling them. To run a
	 *             single-file program, use the following command: java Learning.java To run a single-file program with arguments, use
	 *             the following command: java Learning.java Advaith Ram Mamatha
	 *             Java 11 introduced a new feature to run a single-file program
	 *             without explicitly compiling it.
	 */
	
	public class Java11Features {
	    public static void main(String[] args) {
	        System.out.println("Java 11 Features Table:");
	        
	        // Call a method to print the table
	        printJava11FeaturesTable();
	    }

	    public static void printJava11FeaturesTable() {
	        System.out.println("""
	                ====================================================================
	                | Feature                           | Where to Use?                              |
	                ====================================================================
	                | var in Lambda Parameters          | Improves readability in lambda expressions |
	                | String API Enhancements           | isBlank(), lines(), strip(), repeat()      |
	                | Files API Enhancements            | readString(), writeString(), isSameFile()  |
	                | Optional API Enhancements         | isEmpty(), orElseThrow()                   |
	                | HttpClient (Standardized)         | Replaces HttpURLConnection                 |
	                | New Garbage Collector (ZGC, Epsilon) | Low-latency GC                        |
	                | Nest-Based Access Control         | Better encapsulation                       |
	                | Deprecation of Nashorn            | JavaScript engine removed                  |
	                | Flight Recorder & Mission Control | Performance monitoring                     |
	                | Launch Single-File Source Code    | Run Java files without compilation         |
	                | Security Updates (TLS 1.3, ChaCha20) | Improved encryption security           |
	                ====================================================================
	                """);
	    }
	}

	/*
	====================================================================
	| Feature                           | Where to Use?                              |
	====================================================================
	| var in Lambda Parameters          | Improves readability in lambda expressions |
	| String API Enhancements           | isBlank(), lines(), strip(), repeat()      |
	| Files API Enhancements            | readString(), writeString(), isSameFile()  |
	| Optional API Enhancements         | isEmpty(), orElseThrow()                   |
	| HttpClient (Standardized)         | Replaces HttpURLConnection                 |
	| New Garbage Collector (ZGC, Epsilon) | Low-latency GC                        |
	| Nest-Based Access Control         | Better encapsulation                       |
	| Deprecation of Nashorn            | JavaScript engine removed                  |
	| Flight Recorder & Mission Control | Performance monitoring                     |
	| Launch Single-File Source Code    | Run Java files without compilation         |
	| Security Updates (TLS 1.3, ChaCha20) | Improved encryption security           |
	====================================================================
	*/

	public static void main(String[] args) {

		System.out.println("Learning Java 11 features");

	}
	/*
	 * Epsilon Garbage Collector (EpsilonGC) Java 11 introduced a no-op garbage
	 * collector that does no memory reclamation. It is useful for testing and
	 * benchmarking. Enable it using: 
	 * java -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC MyApp.java
	 * This is mostly useful in scenarios where GC overhead needs to be minimized.
	 */

}
