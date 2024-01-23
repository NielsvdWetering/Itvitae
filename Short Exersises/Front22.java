public class Front22 {
	public static void main(String[] args) {
        System.out.println(front22("kitten"));
        System.out.println(front22("ha"));
        System.out.println(front22("abc"));
	}
	
	private static String front22(String text) {
        int stringLength = text.length();
        int amountOfChar = (stringLength >= 2) ? 2 : stringLength;
        String firstTwoChar = text.substring(0, amountOfChar);
        return text = firstTwoChar + text + firstTwoChar;
	}
}