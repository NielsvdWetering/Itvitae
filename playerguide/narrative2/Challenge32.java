package playerguide.narrative2;

import java.util.Scanner;

public class Challenge32 {
	public static void main(String[] args) {
        PasswordValidator passwordValidator;
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter your password: ");
            String password = sc.nextLine();
            passwordValidator = new PasswordValidator(password);
            
            String result = (passwordValidator.getIsValidPassword()) ? "The password is valid." : "Unvalid password.";
            System.out.println(result);
        }
    }
}