import helperclasses.ConsoleHelper;

public class Challenge13 {
	public static void main(String[] args) {
		System.out.print("What x-coördinates is the enemy spotted at? ");
		int x = ConsoleHelper.intInput();
		System.out.print("\nWhat y-coördinates is the enemy at? ");
		int y = ConsoleHelper.intInput();
        
        String northSouth = "";
        String eastWest = "";
        if (x == 0 && y == 0) {
            System.out.println("The enemy is right on top of us!!");
        }
        else {
            if (x > 0) {
                eastWest = "east";
            }
            else if (x < 0) {
                eastWest = "west";
            }
            
            if (y > 0 ) {
                northSouth = "north";
            }
            else if (y < 0) {
                northSouth = "south";
            }
            
            System.out.println("The enemy is to the " + northSouth + eastWest);
        }
    }
}