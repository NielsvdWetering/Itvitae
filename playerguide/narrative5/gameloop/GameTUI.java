package playerguide.narrative5.gameloop;

import playerguide.narrative5.Commandable;
import playerguide.narrative5.gameworld.GameWorld;
import playerguide.narrative5.gameworld.RoomType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import helperclasses.TextColor;

public class GameTUI implements Commandable {
    final private String[] COMMANDS = {"help"};
    ArrayList<String> allCommands = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public GameTUI(String[] playerCommands, String[] gameWorldCommands) {
        allCommands.addAll(Arrays.asList(COMMANDS));
        allCommands.addAll(Arrays.asList(playerCommands));
        allCommands.addAll(Arrays.asList(gameWorldCommands));
    }

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
        System.out.println(TextColor.YELLOW + "----------------------------------------");
        System.out.println("You can perform the following actions:");
        for (String command : allCommands) {
            System.out.println("- " + command);
        }
        System.out.println("----------------------------------------" + TextColor.RESET);
    }


    /*
        I maybe want to add exeption handling to this.
        so it gives you an exeption if it is the wrong length array
     */
    public void printPlayerLocation(int[] playerPositon) {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("You are in the room at (x=%d y=%d).\n", playerPositon[0], playerPositon[1]);
    }

    public void printRoomCondition(RoomType room, boolean fountainIsActive) {
        String text = switch (room) {
            case CAVERN_ENTRANCE -> "You see light coming from the cavern entrance.";
            case FOUNTAIN -> (fountainIsActive) ? "You hear the rushing waters from the Fountain of Objects. It has been reactivated!" : "You hear water dripping in this room. The Fountain of Objects is here!";
            case PITT -> "you fell";
            default -> "You see or hear nothing, its just cold and dark... This room is empty.";
        };
        System.out.println(TextColor.CYAN + text + TextColor.RESET);
    }

}
