public class Challenge6 {
	public static void main(String[] args) {
		byte aByteNumber = 127;
		short aShortNumber = 32767;
		int aIntNumber = 2147483647;
		long aLongNumber = 9223372036854775807L;
		float aFloatNumber = 1.234567F;
		double aDoubleNumber = 1.234567890123456;
		char aCharacter = 'x';
		boolean aBoolean = true;
		String aString = "This is a String";
		
		System.out.println("this is a collection of the 8 primitive datatypes in java");
		System.out.println("the first four types are whole numbers:");
		System.out.println("An example of a byte is: " + aByteNumber);
		System.out.println("An example of a short is: " + aShortNumber);
		System.out.println("An example of an int is: " + aIntNumber);
		System.out.println("An example of a long is: " + aLongNumber);
		System.out.println("\nThen there are two types of data that holds decimal numbers:");
		System.out.println("An example of a float is: " + aFloatNumber);
		System.out.println("An example of a double is: " + aDoubleNumber);
		System.out.println("\nAnd there is the character and boolean type");
		System.out.println("The character type holds a character, an example of a char is: " + aCharacter);
		System.out.println("The boolean is a simple true or false type, an example of a boolean is: " + aBoolean);
		System.out.println("\nThere is also a (not a primitive) type for text, called the String data type.");
		System.out.println("an example of a String is: " + aString);
	
	}
}