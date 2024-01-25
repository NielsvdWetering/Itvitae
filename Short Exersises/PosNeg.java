public class PosNeg {
	public static void main(String[] args) {
        System.out.println(posNeg(1, -1, false));
        System.out.println(posNeg(-1, 1, false));
        System.out.println(posNeg(-1, -1, false));
        System.out.println(posNeg(1, -1, true));
        System.out.println(posNeg(-1, 1, true));
        System.out.println(posNeg(-1, -1, true));
	}
	
	private static boolean posNeg(int firstValue, int secondValue, boolean negative) {
        if (negative) {
            return (firstValue < 0 && secondValue < 0);
        }
        else {
            if (firstValue < 0) {
                return (secondValue >= 0);
            }
            else {
                return (firstValue >=    0);
            }
        }
	}
}