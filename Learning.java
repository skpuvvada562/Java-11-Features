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
