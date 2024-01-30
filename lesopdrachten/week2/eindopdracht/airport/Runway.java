package airport;
import java.util.Scanner;
import aircraft.Landing;
public class Runway {
	public static void main(String[] args) {
        String text;
        
        Landing runwayInUse = new Landing();
        System.out.print("Is the aircraft landing? ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(runwayInUse.landing(input));
	}
    
}