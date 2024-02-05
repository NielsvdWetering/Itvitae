package shortexercises;

public class NoTriples {
	public static void main(String[] args) {
        System.out.println(integerNumberArrays(new int[] {1, 2, 3, 4, 5, 6, 5, 5}));
        System.out.println(integerNumberArrays(new int[] {1, 2, 3, 4, 4, 4, 5, 6}));
        System.out.println(integerNumberArrays(new int[] {1, 1, 1, 4, 5, 6}));
        System.out.println(integerNumberArrays(new int[] {1, 2}));
	}
    
    private static boolean integerNumberArrays(int[] numbers) {
        for (int i = 0; i < (numbers.length - 2); i++) {    //numbers.length -2, because in the if loops it compares to 2 numbers ahead, if this would go to numbers.length the if loop would be out of bounds
            System.out.println(numbers[++i]);
            if (numbers[i] == numbers[i + 1] && numbers[i] == numbers[i + 2]) return false;
        }
        return true;
    }
}