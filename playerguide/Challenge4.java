import java.util.Scanner;

public class Challenge4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The Bread is ready!");
		System.out.println("Who is the bread for?");
		String name = sc.nextLine();
		System.out.println("Noted, the bread is for: " + name);
	}
}