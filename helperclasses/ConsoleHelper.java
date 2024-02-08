package helperclasses;
import java.util.Scanner;

public class ConsoleHelper {

    public static int askForInteger(String question) {
        Scanner scan = new Scanner(System.in);
        System.out.println(question);
        String temp = scan.nextLine();
        int input = Integer.parseInt(temp);
        return input;
    }
    
    //asks for an integer nummber with the sting as question between an minimum and maximum value
    public static int askForInteger(String question, int min, int max) {
        Scanner scan = new Scanner(System.in);
        
        int integerNumber = 0;
        boolean inRange = true;
        System.out.print(question);
        while (inRange) {
            String temp = scan.nextLine();
            integerNumber = Integer.parseInt(temp);
            if (integerNumber >= min && integerNumber <= max) {
                inRange = false;
            } else {
                System.out.printf("That was not a integer number between %d and %d, please try again: \n", min, max);
            }
        }
        return integerNumber;
    }
}