package helperclasses;
import java.util.Scanner;

public class ConsoleHelper {

    public static int askForInteger(String question) {
        Scanner sc = new Scanner(System.in);
        int integerNumber = 0;
        boolean notInteger = true;
        
        System.out.println(question);
        
        do {
            if (sc.hasNextInt()) {
                integerNumber = sc.nextInt();
                notInteger = false;
            } else {
                sc.nextLine();
            }
        } while (notInteger);
        
        return integerNumber;
    }
    
    //asks for an integer nummber with the sting as question between an minimum and maximum value
    public static int askForInteger(String question, int min, int max) {
        int integerNumber = 0;
        boolean inRange = false;
        
        do {
            integerNumber = askForInteger(question);
            if (integerNumber >= min && integerNumber <= max) {
                inRange = true;
            } else {
                System.out.printf("That was not a integer number between %d and %d, please try again: \n", min, max);
            }
        } while (!inRange);
        
        return integerNumber;
    }
}