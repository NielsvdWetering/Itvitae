package shortexercises;

public class EveryNth {
	public static void main(String[] args) {
        everyNth("Miracle", 2);
        everyNth("abcdefg", 2);
        everyNth("abcdefg", 3);
        everyNth("412341234123412341234", 4);
	}
    
    private static void everyNth(String text, int n) {
        int stringLength = text.length();
        int lengthReturnString = stringLength / n + 1;
        String result = "";
        
        for (int i = 0; i < lengthReturnString; i++) {
            result += text.charAt(n * i);
        }
        
        System.out.println(result);
    }
}