package java11features;

public class StringStrip {

	/**
	 * 
	 * @param args Removes white spaces from the beginning and end of the string.
	 */
	public static void main(String[] args) {
		
		String str = "  Hello  ";
        System.out.println(str.strip());
        System.out.println(str.stripLeading());
        System.out.println(str.stripTrailing());

	}

}
