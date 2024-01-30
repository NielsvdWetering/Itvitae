package shortexercises;

import helperclasses.ConsoleHelper;

public class Factorial {
	public static void main(String[] args) {
        ConsoleHelper ch = new ConsoleHelper();
        
        int inputNumber = ch.askForInteger("Please enter an integer greater than 0: ");
        
        int answer = 1;
        for (int i = 1; i <= inputNumber; i++) {
            answer *= i;
        }
        
        System.out.println("The factorial of " + inputNumber + " is " + answer);
	}
}