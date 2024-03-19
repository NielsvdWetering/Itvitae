package playerguide.narrative0;

import java.util.Scanner;

public class Challenge10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int estates;
		int dutchies;
		int provinces;
		int kingdomScore;
		
		System.out.println("Welcome to the Dominion of Kings Calculator 3000!");
		System.out.println("The calculator to calculate the extend of your epic empire!");
		
		//estates
		System.out.print("\nFirst, how many estates does your kingdom have? ");
		String estateString = sc.nextLine();
		estates = Integer.parseInt(estateString);
		
		//dutchies
		System.out.print("And how many dutchies do you have? ");
		String dutchiesString = sc.nextLine();
		dutchies = Integer.parseInt(dutchiesString);
		
		//provinces
		System.out.print("And last, but also most importantly, how many provinces does your kindom contain? ");
		String provincesString = sc.nextLine();
		provinces = Integer.parseInt(dutchiesString);
		
		//calculation and printing of the score
		kingdomScore = estates + dutchies * 3 + provinces * 6;
		System.out.println("The score of your empire is: " + kingdomScore);
	}
}