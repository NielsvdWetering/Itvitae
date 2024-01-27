import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
        int input;
        int a = 0;
        int b = 1;
        int sum = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Up to what number do you want to see Fibonaccies number? ");
        input = scan.nextInt();
    
        while (sum <= input) {
        sum = a + b;
        System.out.println(b);
        a = b;
        b = sum;
        }
    }
}