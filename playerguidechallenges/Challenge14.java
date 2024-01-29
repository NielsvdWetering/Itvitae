import java.util.Scanner;

public class Challenge14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		String temp;
		
		System.out.println("Welcome to the shop!\nWe have the following wares:" +
							"\n1. Rope" +
							"\n2. Torches" +
							"\n3. Climbing equipment" +
							"\n4. Clean water" +
							"\n5. Manchette" +
							"\n6. Canoe" +
							"\n7. Food supplies");
		System.out.print("\nWhat do you want to see the price of? ");
		temp = scan.nextLine();
		choice = Integer.parseInt(temp);
		
		switch (choice) {
			case 1 -> System.out.println("A rope costs 10 gold");
			case 2 -> System.out.println("A torch costs 15 gold");
			case 3 -> System.out.println("Climbing equipment costs 25 gold");
			case 4 -> System.out.println("Clean water costs 1 gold");
			case 5 -> System.out.println("A manchette costs 20 gold");
			case 6 -> System.out.println("A canoe cost 200 gold");
			case 7 -> System.out.println("Food supplies cost 1 gold");
		}
	}
}