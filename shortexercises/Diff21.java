public class Diff21 {
	public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(24));
	}
    
    public static int diff21(int n) {
        int difference;
        
        difference = 21 - n;
        if (difference < 0) {
            difference = difference * -2;
            return difference;
        }
        else {
            return difference;
        }
    }
}