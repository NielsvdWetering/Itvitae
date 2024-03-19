package playerguide.narrative0;

import java.util.Scanner;

public class Challenge15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
        final int ROPE = 10;
        final int TORCH = 15;
        final int CLIMBING_EQUIPMENT = 25;
        final int CLEAN_WATER = 1;
        final int MANCHETTE = 20;
        final int CANOE = 200;
        final int FOOD_SUPPLIES = 1;
		String temp;
        String name;
		
        System.out.print("Welcome to the shop!\nWhat is your name? ");
        name = scan.nextLine();
		System.out.println("We have the following wares:" +
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
			case 1 -> System.out.println("A rope costs " + price(name, ROPE) + " gold");
			case 2 -> System.out.println("A torch costs " + price(name, TORCH) + " gold");
			case 3 -> System.out.println("Climbing equipment costs " + price(name, CLIMBING_EQUIPMENT) + " gold");
			case 4 -> System.out.println("Clean water costs " + price(name, CLEAN_WATER) + " gold");
			case 5 -> System.out.println("A manchette costs " + price(name, MANCHETTE) + " gold");
			case 6 -> System.out.println("A canoe cost " + price(name, CANOE) + " gold");
			case 7 -> System.out.println("Food supplies cost " + price(name, FOOD_SUPPLIES) + " gold");
		}
	}
    
    private static int price(String name, int priceOfArticle) {
        return (name.equalsIgnoreCase("niels")) ? priceOfArticle / 2 : priceOfArticle;
    }
}