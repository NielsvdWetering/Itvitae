import java.util.Scanner;

public class CheckIfNumberIsEvenOrOdd {
	public static void main(String[] args) {
        int number;
        
        System.out.print("Input a number: ");
        number = intInput();
        System.out.println(evenOrOdd(number));
	}
	
	private static int intInput() {
        int input;
        
        Scanner sc = new Scanner(System.in);
        input = Integer.parseInt(sc.nextLine());
        return input;
	}
	
	private static int evenOrOdd(int input) {
        int returnValue;
        
        return returnValue = (input % 2 == 0) ? 1 : 0;
	}
}