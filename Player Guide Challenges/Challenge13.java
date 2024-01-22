import java.util.Scanner;

public class Challenge13 {
	public static void main(String[] args) {
		int x;
		int y;
		
		System.out.print("What x-coördinates is the enemy spotted at? ");
		x = intInput();
		System.out.print("\nWhat y-coördinates is the enemy at? ");
		y = intInput();
		
		if (x == 0 && y == 0) {
			System.out.println("The enemy is right on top of us!!");
		}
		else if (x == 0) {
			if (y <0 ) {
				System.out.println("The enemy is to the South");
			}
			else if (y > 0) {
				System.out.println("The enemy is to the North");
			}
		}
		else if (y == 0) {
			if (x < 0) {
				System.out.println("The enemy is to the West");
			}
			else if (x > 0) {
				System.out.println("The enemy is to the East");
			}
		}
		else if (x != 0 && y != 0) {
			if (x < 0 && y <0) {
				System.out.println("The enemy is to the Southeast");
			}
			else if (x > 0 && y < 0) {
				System.out.println("The enemy is to the Southwest");
			}
			else if (x > 0 && y > 0) {
				System.out.println("The enemy is to the Northwest");
			}
			else if (x < 0 && y > 0) {
				System.out.println("The enemy is to the Northeast");
			}
		}
	}
	
	public static int intInput() {
		int input;
		
		Scanner scan = new Scanner(System.in);
		String temp = scan.nextLine();
		input = Integer.parseInt(temp);
		return input;
	}
}