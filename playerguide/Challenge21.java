package playerguide;

public class Challenge21 {
    public static void main(String[] args) {
        recursion(10);
    }
    
    private static int recursion(int x) {
        if (x > 0) {
            System.out.println(x);
            return x + recursion(x - 1);
        } else {
            return 0;
        }
    }
}