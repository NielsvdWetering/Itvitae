package playerguide.narrative5.gameloop;

import playerguide.narrative5.gameworld.GameWorld;
import playerguide.narrative5.gameworld.RoomType;
import playerguide.narrative5.player.Player;
import java.util.Scanner;
import helperclasses.TextColor;

public class GameTUI {
    Player player;
    GameWorld gameWorld;
    Scanner sc = new Scanner(System.in);

    public GameTUI(Player player, GameWorld gameWorld) {
        this.player = player;
        this.gameWorld = gameWorld;
    }

    public static int askForGameSize() {
        return 4;
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
        } else {
            System.out.println("not a valid input, type 'help' for all available options");
            askAndRunUserActions();
        }
    }

    private void printHelpMenu() {
        System.out.println("this is the help menu");
    }

    public void printPlayerLocation() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("You are in the room at (row=%d column=%d).\n", player.getPosX(), player.getPosY());
    }

    public void printRoomCondition() {
        RoomType room = gameWorld.getRoomAt(player.getLocation());
        String text = switch (room) {
            case CAVERN_ENTRANCE -> "You see light coming from the cavern entrance.";
            case FOUNTAIN -> fountainStatus();
            case PITT -> "you fell";
            default -> "You see or hear nothing, its just cold and dark... This room is empty.";
        };
        System.out.println(TextColor.CYAN + text + TextColor.RESET);
    }

    private String fountainStatus() {
        return (!gameWorld.getFountainIsActivated()) ? "You hear water dripping in this room. The Fountain of Objects is here!" : "You hear the rushing of water from the Fountain of Objects. It has been reactivated!";
    }
}
