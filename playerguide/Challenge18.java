package playerguide;

import helperclasses.ConsoleHelper;

public class Challenge18 {
	public static void main(String[] args) {
        ConsoleHelper ch = new ConsoleHelper();
        int[] integerArray = new int[5];
        int[] copyOfArray =new int[5];
        
        for (int i = 0; i < 5; i++) {
            int userInput = ch.askForInteger("Enter an integer: ");
            integerArray[i] = userInput;
        }
        
        for (int i = 0; i < integerArray.length; i++) {
            copyOfArray[i] = integerArray[i];
        }
        
        printArrayOf5("The original array is: ", integerArray);
        printArrayOf5("The copy of the original array is: ", copyOfArray);
	}
    
    private static void printArrayOf5(String text, int[] array) {
        System.out.print(text);
        for (int i = 0; i < 5; i++) System.out.print(array[i]);
        System.out.println();
    }
}