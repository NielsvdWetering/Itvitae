package shortexercises;

public class NoTriples {
	public static void main(String[] args) {
        System.out.println(integerNumberArrays(new int[] {1, 2, 3, 4, 5, 6}));
        System.out.println(integerNumberArrays(new int[] {1, 2, 3, 4, 4, 4, 5, 6}));
        System.out.println(integerNumberArrays(new int[] {1, 1, 1, 4, 5, 6}));
        System.out.println(integerNumberArrays(new int[] {1, 2}));
	}
    
    private static boolean integerNumberArrays(int[] numbers) {
        for (int i = 0; i < (numbers.length - 2); i++) {
            if (numbers[i] == numbers[i++] & numbers[i] == numbers[i + 2]) return true;
        }
        return false;
    }
}