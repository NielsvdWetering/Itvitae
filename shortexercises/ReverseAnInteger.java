import java.util.Scanner;

public class ReverseAnInteger {
	public static void main(String[] args) {
        String input;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        input = sc.nextLine();
        System.out.println(reverseAnInteger(input));
	}
    
    private static String reverseAnInteger(String input) {
        int lengthOfString;
        String reverseString = "";
        
        lengthOfString = input.length();
        
        for (int i = 0; i < lengthOfString; i ++) {
            reverseString = input.charAt(i) + reverseString;
        }
        
        return reverseString;
    }
}