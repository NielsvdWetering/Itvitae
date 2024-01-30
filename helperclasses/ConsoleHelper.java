package helperclasses;
import java.util.Scanner;

public class ConsoleHelper {

    //intInput word op dit moment niet gebruikt in een andere class
	public static int intInput() {
        Scanner scan = new Scanner(System.in);
        String temp = scan.nextLine();
        int input = Integer.parseInt(temp);
        return input;
	}
    
    public static int askForInteger(String question) {
        Scanner scan = new Scanner(System.in);
        System.out.println(question);
        String temp = scan.nextLine();
        int input = Integer.parseInt(temp);
        return input;
    }
}