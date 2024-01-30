public class FizzBuzz {
	public static void main(String[] args) {
        
            for (int i = 0; i <=100; i++) {
                int number = i;
                String fizzedNumber = "";
                
                while (number != 0) {
                    int modulusOfNumber = number % 10;
                    number = number / 10;
                    
                    switch (modulusOfNumber) {
                        case 3 -> fizzedNumber = "Fizz" + fizzedNumber;
                        case 5 -> fizzedNumber = "Buzz" + fizzedNumber;
                        default -> fizzedNumber = modulusOfNumber + fizzedNumber;
                    }
                }
                
                System.out.print(fizzedNumber + " ");
            }
	}
}