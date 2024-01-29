public class NotString {
	public static void main(String[] args) {
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));
	}
	
	private static String notString(String text) {
        int stringLength = text.length();
        int amountOfChar = (stringLength > 3) ? 3 : stringLength;
        String isItNot = text.substring(0, amountOfChar);
        return text = (isItNot.equals("not")) ? text : "not " + text;
	}
}