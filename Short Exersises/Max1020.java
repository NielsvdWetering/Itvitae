public class Max1020 {
	public static void main(String[] args) {
        System.out.println(max1020(11, 19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(29, 20));
        System.out.println(max1020(10, 49));
        System.out.println(max1020(34, 55));
	}
	
	private static int max1020(int firstValue, int secondValue) {
        if (firstValue >= 10 && firstValue <= 20 && secondValue >= 10 && secondValue <= 20) {
            int largestValue = Math.max(firstValue, secondValue);
            return largestValue;
        }
        else if (firstValue >= 10 && firstValue <= 20) {
            return firstValue;
        }
        else if (secondValue >= 10 && secondValue <= 20) {
            return secondValue;
        }
        else {
            return 0;
        }
	}
}