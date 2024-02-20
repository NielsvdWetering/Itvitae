package lesopdrachten.week5;

import java.util.LinkedList;

public class Fibonacci {
    static LinkedList<Long> fibonacciNumbers = new LinkedList<Long>();
    
    public static void main(String args[]) {
        
        fibonacciNumbers.add((long)0);
        fibonacciNumbers.add((long)1);
        fibonacciNumbers.add((long)1);
        
        int maxNumber = 50;
        
        fibonacciRecursion(maxNumber);
        System.out.print(fibonacciNumbers);
	}
    
    public static void fibonacciRecursion(int n) {
        
        if (n > 3) {
            int length = fibonacciNumbers.size();   
            fibonacciNumbers.add(fibonacciNumbers.get(length-2) + fibonacciNumbers.get(length-1));
            fibonacciRecursion(n-1);
        }
	}
}

