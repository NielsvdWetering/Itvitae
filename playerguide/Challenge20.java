package playerguide;
import helperclasses.ConsoleHelper;

/* 
    The assignment is in the helperclasses.ConsoleHelper class.
    in this class the askForInteger that asks for an integer that uses an string (will be printed on the console as question) and a min and max integer value will be used.
*/


public class Challenge20 {
	public static void main(String[] args){
        int userInput = ConsoleHelper.askForInteger("Please enter an integer: ");
        System.out.println(userInput);
	}
}