package playerguide.narrative0;
import helperclasses.ConsoleHelper;

public class Challenge16 {
	public static void main(String[] args) {
        ConsoleHelper ch = new ConsoleHelper();
        
        int number = ch.askForInteger("User 1, enter a number between 0 and 100: ");
        
        while (number < 0 || number > 100) {
            number = ch.askForInteger("That is not a valid number.\nEnter a number between 0 and 100: ");
        }
        
        for (int i = 0; i < 50; i++) {
        System.out.println();
        }
        
        int guess = ch.askForInteger("User 2, what is your guess: ");
        
        while (guess != number) {
            if (guess < number) {
                guess = ch.askForInteger(guess + " is too low, guess again: ");
            }
            else {
                guess = ch.askForInteger( guess + " is too high, guess again: ");
            }
        }
        
        System.out.println("That was the correct number!");
	}
}