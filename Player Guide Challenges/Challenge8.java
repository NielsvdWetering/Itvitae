import java.util.Scanner;

public class Challenge8 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	//asking for the base of the triangle
	System.out.print("What is the base of your triangle? ");
	String baseString = sc.nextLine();
	int base = Integer.parseInt(baseString);
	
	//asking for the height of the triangle
	System.out.print("What is the height of the triangle? ");
	String heightString = sc.nextLine();
	int height = Integer.parseInt(heightString);
	
	//calculating and printing the area
	int area = base * height / 2;
	System.out.println("the area of the triangle is: " + area);
	}
}