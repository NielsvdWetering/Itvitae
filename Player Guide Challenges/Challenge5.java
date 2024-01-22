import java.util.Scanner;


public class Challenge5 {
	public static void main(String[] args) {
		System.out.println("What kind of thing are we talking about?");
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();	//variable a stores the thing they are talking about
		System.out.println("How would you describe it? Big? Azure? Tattered?");
		String b = input.nextLine();	//variable b stores how you would discribe that thing
		String c = "of Doom";		//variable c stores the string "of Doom"
		String d = "3000";			//variable d stores the string "3000"
		System.out.println("The " + b + " " + a + " of " + c + " " + d + "!");
		
		/*you could make this code a lot easyer to read by using more describtive variable names
		this is the second row
		and the third
		the bug was the absence of "Line" in "nextLine" in line 5 and 7 of the code
		*/
	}
}