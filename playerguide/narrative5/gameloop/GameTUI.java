package playerguide.narrative5.gameloop;

import playerguide.narrative5.Commandable;
import playerguide.narrative5.gameworld.RoomType;
import java.util.Scanner;
import helperclasses.TextColor;

public class GameTUI implements Commandable {
    final private String[] COMMANDS = {"help"};
    Scanner sc = new Scanner(System.in);

    public void runCommand(String command) {
        switch (command.toLowerCase()) {
            case "help" -> printHelpMenu();
            //case "exit" -> exitGame();
        }
    }

    public String[] getCommands() {
        return COMMANDS;
    }

    public static int askForGameSize() {
        return 4;
    }

    public String getUserInput(String question) {
        System.out.print(question);
        return sc.nextLine();
    }

    private void printHelpMenu() {
        System.out.println("this is the help menu");
    }


    /*
        I want to add exeption handling to this.
        so it gives you an exeption if it is the wrong length array
     */
    public void printPlayerLocation(int[] playerPositon) {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("You are in the room at (row=%d column=%d).\n", playerPositon[0], playerPositon[1]);
    }

    public void printRoomCondition(RoomType room) {
        String text = switch (room) {
            case CAVERN_ENTRANCE -> "You see light coming from the cavern entrance.";
            //case FOUNTAIN -> fountainStatus();
            case PITT -> "you fell";
            default -> "You see or hear nothing, its just cold and dark... This room is empty.";
        };
        System.out.println(TextColor.CYAN + text + TextColor.RESET);
    }

//    private String fountainStatus() {
//        return (!gameWorld.getFountainIsActivated()) ? "You hear water dripping in this room. The Fountain of Objects is here!" : "You hear the rushing of water from the Fountain of Objects. It has been reactivated!";
//    }
}
