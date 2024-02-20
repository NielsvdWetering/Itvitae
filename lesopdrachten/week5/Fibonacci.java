package lesopdrachten.week5;

import java.util.LinkedList;

public class Fibonacci {
    static LinkedList<Number> fibonacciNumbers = new LinkedList<Number>();
    
    public static void main(String args[]) {
        
        fibonacciNumbers.add(0);
        fibonacciNumbers.add(1);
        fibonacciNumbers.add(1);
        
        int maxNumber = 50;
        
        fibonacciRecursion(maxNumber);
        System.out.print(fibonacciNumbers);
	}
    
    public static void fibonacciRecursion(int n) {
        
        if (n > 3) {
            int length = fibonacciNumbers.size();
            Number a = fibonacciNumbers.get(length-2);
            Number b = fibonacciNumbers.get(length-1);
            fibonacciNumbers.add(a.longValue()+b.longValue());
            fibonacciRecursion(n-1);
        }
	}
}

