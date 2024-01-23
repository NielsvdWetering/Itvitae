public class LastDigit {
	public static void main(String[] args) {
		System.out.println(lastDigit(7, 17));
		System.out.println(lastDigit(6, 7));
		System.out.println(lastDigit(3, 123));
	}
	
	public static boolean lastDigit(int firstDigit, int secondDigit) {
		return(firstDigit % 10 == secondDigit % 10);
	}
}