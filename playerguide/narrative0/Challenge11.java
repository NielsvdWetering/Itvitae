package playerguide.narrative0;

import java.util.Scanner;
import java.awt.Toolkit;

public class Challenge11 {
	public static void main(String[] args) {
		int targetRow;
		int targetColumn;
		
		System.out.println("We need to defend the city!");
		System.out.print("What row are they targeting? ");
		targetRow = intInput();
		System.out.print("\nWhat column are they targeting? ");
		targetColumn = intInput();
		System.out.println("Deploy to:");
		System.out.println("(" + (targetRow - 1) + ", " + targetColumn + ")");
		System.out.println("(" + targetRow + ", " + (targetColumn - 1) + ")");
		System.out.println("(" + (targetRow + 1) + ", " + targetColumn + ")");
		System.out.println("(" + targetRow + ", " + (targetColumn + 1) + ")");
		Toolkit.getDefaultToolkit().beep();
	}
	
	
	public static int intInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int x = Integer.parseInt(input);
		return x;
	}
	
}