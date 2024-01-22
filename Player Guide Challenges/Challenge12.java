import java.util.Scanner;

public class Challenge12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int clockNumber;
		
		System.out.print("The number the clock ticks or tocks: ");
		clockNumber = scan.nextInt();
		
		if (clockNumber % 2 == 0) {
			System.out.println("Tick");
		}
		else {
			System.out.println("Tock");
		}
	}
}