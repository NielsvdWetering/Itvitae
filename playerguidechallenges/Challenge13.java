package playerguidechallenges;
import helperclasses.ConsoleHelper;

public class Challenge13 {
	public static void main(String[] args) {
		int x = ConsoleHelper.askForInteger("What x-coördinates is the enemy spotted at? ");
		int y = ConsoleHelper.askForInteger("\nWhat y-coördinates is the enemy at? ");
        
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