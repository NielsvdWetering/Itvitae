package lesopdrachten.week3;

import java.util.Scanner;

public class Eindopdracht {
	public static void main(String[] args) {
        System.out.println("Enter a positive integer: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        
        int sum = 0;
        int oddSum = 0;
        for (int i = 0; i <= userInput; i++) {
            sum += i;
            if (i % 2 != 0) oddSum += i;
        }
        
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The sum of the odd numbers is: " + oddSum);
	}
}