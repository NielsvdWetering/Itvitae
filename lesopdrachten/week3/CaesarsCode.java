package lesopdrachten.week3;

import java.util.Scanner;

public class CaesarsCode {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What word (consisting ONLY capital letters) do you want to convert to Caesar's code? ");
        String userInput = sc.nextLine();
        ceasarsCode(userInput);
        //A tm Z loopt van 65 tm 90
        
        //vragen om een input (string0
        //for loop voor de length van de string
            //zet character in char character
            //maak nieuwe string waar characters aan geplakt worden
	}
    
    private static void ceasarsCode(String text) {
        String result = "";
        
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            result = (a >= 65 && a <= 87) ? result + (char) (a + 3) : result + (char) (a - 23);
        }
        
        System.out.println(result);
    }
}