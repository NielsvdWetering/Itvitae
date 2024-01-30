import java.util.Scanner;

public class Autorijden {
	public static void main(String[] args) {
		int age = 27;
		String licence;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hoe oud ben je? ");
		String ageString = sc.nextLine();
		age = Integer.parseInt(ageString);
		
		System.out.print("\nHeb je een rijbewijs? ");
		licence = sc.nextLine();
		
		if (age >= 18 && licence.equalsIgnoreCase("ja") ) {
			System.out.println("Je mag autorijden");
		}
		else {
			System.out.println("Je mag geen autorijden");
		}
	}
}