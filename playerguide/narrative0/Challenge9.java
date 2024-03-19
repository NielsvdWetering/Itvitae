package playerguide.narrative0;

import java.util.Scanner;

public class Challenge9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int sisters = 4;
		int eggs;
		int eggsPP;
		int eggsDuckbear;
		
		//asking how many eggs
		System.out.print("how many eggs today? ");
		String eggsString = sc.nextLine();
		eggs = Integer.parseInt(eggsString);
		
		//calculation
		eggsPP = eggs / sisters; //when using an integer, java discards the numbers behind the ,/.  So deviding by the sisters is enough in this case
		eggsDuckbear = eggs % sisters;
		
		//print the result
		System.out.println("Each sister should get " + eggsPP + " eggs");
		System.out.println("The Duckbear should get " + eggsDuckbear + " eggs");
	}
}