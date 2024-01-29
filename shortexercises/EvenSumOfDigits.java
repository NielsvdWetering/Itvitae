public class EvenSumOfDigits {
	public static void main(String[] args) {
        int number;
        int sum;
        int digit;
            
        for (int i = 100; i < 150; i++) {
            number = i;
            sum = 0;
            while (number != 0) {
                digit = number % 10;
                number = number / 10;
                sum += digit;
            }
            
            if (sum % 2 == 0) {
                System.out.println(i);
            }
        }
	}
}