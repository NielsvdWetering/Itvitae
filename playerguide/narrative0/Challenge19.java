package playerguide.narrative0;

public class Challenge19 {
    public static void main(String[] args) {
        
        int[] array = { 4, 51, -7, 13, -99, 15, -8, 45, 90 };
        int currentSmallest = Integer.MAX_VALUE; // Start higher than anything in the array.
        for (int i : array) {
            if (i < currentSmallest) currentSmallest = i;
        }
        System.out.println(currentSmallest);

        int total = 0;
        for (int i : array) total += i;
        double average = (double)total / array.length;
        System.out.println(average);
    }
}