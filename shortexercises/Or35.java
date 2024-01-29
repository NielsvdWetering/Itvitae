public class Or35 {
	public static void main(String[] args) {
		System.out.println(or35(3));
		System.out.println(or35(10));
		System.out.println(or35(8));
	}
	
	public static boolean or35(int input) {
		return (input % 3 == 0 || input % 5 == 0);
		// De oplossing van de simple exercises gebruikt (input % == 0 ) || (input % 5 == 0), wat is het verschil met hoe ik de OR operator hier heb neergezet?
	}
}