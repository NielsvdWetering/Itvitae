package shortexercises;

import helperclasses.ConsoleHelper;

public class IsPrime {
    
	public static void main(String[] args) {
        int userInput = ConsoleHelper.askForInteger("Enter a positive integer: ");
        System.out.println(isPrime(userInput));
	}
    
    private static boolean isPrime(int number) {
        boolean primeOrNot;

        if (number == 2 || number == 3) {
            return true;
        }
        else if (number % 2 == 0 || number <= 1) {
            return false;
        }
        else {
            for (int i = 3; i < number; i += 2) {
                primeOrNot = (number % i != 0);
                if (primeOrNot == false) {
                    break;
                }
            }
        }
        
        return primeOrNot;
    }
}       