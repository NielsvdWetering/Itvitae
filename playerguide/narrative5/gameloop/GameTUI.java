package playerguide.narrative5.gameloop;

import playerguide.narrative5.gameworld.GameWorld;
import playerguide.narrative5.player.Player;
import java.util.Scanner;

public class GameTUI {
    Player player;
    GameWorld gameWorld;
    Scanner sc = new Scanner(System.in);

    public GameTUI(Player player, GameWorld gameWorld) {
        this.player = player;
        this.gameWorld = gameWorld;
    }

    private String getUserInput(String question) {
        System.out.print(question);
        return sc.nextLine();
    }

    public void askAndRunUserActions() {
        String userInput = getUserInput("What do you want to do? ");
        if (userInput.equalsIgnoreCase("help")) {
            printHelpMenu();
            askAndRunUserActions();
        } else if (player.checkIfPlayerCommand(userInput)) {
            player.runPlayerCommand(userInput);
        } else if (gameWorld.checkIfGameWorldCommand(userInput)) {
            gameWorld.runGameWorldCommand(userInput);
        }
    }

    private void printHelpMenu() {
        System.out.println("this is the help menu");
    }
}
