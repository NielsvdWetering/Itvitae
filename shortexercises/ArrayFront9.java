package shortexercises;

public class ArrayFront9 {
    public static void main(String[] args) {
        System.out.println(arrayFront(new int[]{1, 2, 9, 3, 4}));
        System.out.println(arrayFront(new int[]{1, 2}));
        System.out.println(arrayFront(new int[]{1, 3, 4}));
        System.out.println(arrayFront(new int[]{1, 2, 5, 8, 9, 3, 4}));
    }
    
    private static boolean arrayFront(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 9) return true;
            if (inputArray[i] >= 4) break;
        }
        return false;
    }
}