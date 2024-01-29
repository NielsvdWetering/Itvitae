import java.util.Scanner;

/*Changed the int variables to double in order to avoid the roundoff error when the base and height are both 1
 *base and height also needed to be changed to doubles because if they would remain int the calculation would still be rounded of into an int and only after that be assigned to the double area
 */

public class Challenge8 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	//asking for the base of the triangle
	System.out.print("What is the base of your triangle? ");
	String baseString = sc.nextLine();
	double base = Double.parseDouble(baseString);
	
	//asking for the height of the triangle
	System.out.print("What is the height of the triangle? ");
	String heightString = sc.nextLine();
	double height = Double.parseDouble(heightString);
	
	//calculating and printing the area
	double area = base * height / 2;
	System.out.println("the area of the triangle is: " + area);
	}
}
