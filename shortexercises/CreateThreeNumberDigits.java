package shortexercises;

public class CreateThreeNumberDigits {
	public static void main(String[] args) {
        int count = 0;
        for (int firstDigit = 1; firstDigit <= 4; firstDigit++) {
            for (int secondDigit = 1; secondDigit <= 4; secondDigit++) {
                if (secondDigit != firstDigit) {
                    for (int thirtDigit = 1; thirtDigit <= 4; thirtDigit++) {
                        if (thirtDigit != firstDigit && thirtDigit != secondDigit) {
                            System.out.println("" + firstDigit + secondDigit + thirtDigit);
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println("the max number count is: " + count);
	}
}