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
        boolean inRange = false;
        while (inRange) {
            System.out.print("question");
            String temp = scan.nextLine();
            integerNumber = Integer.parseInt(temp);
            if (integerNumber > min && integerNumber < max) inRange = true;
        }
        return integerNumber;
    }
}