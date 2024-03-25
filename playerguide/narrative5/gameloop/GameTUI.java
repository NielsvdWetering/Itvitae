package playerguide.narrative5.gameloop;

import helperclasses.FakeLoading;
import playerguide.narrative5.Commandable;
import playerguide.narrative5.gameworld.GameWorld;
import playerguide.narrative5.gameworld.RoomType;
import playerguide.narrative5.player.Player;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import helperclasses.TextColor;

public class GameTUI implements Commandable {
    final private String[] COMMANDS = {"help", "exit"};
    Player player;
    GameWorld gameWorld;
    static Scanner sc = new Scanner(System.in);

    public GameTUI(Player player, GameWorld gameWorld) {
        this.player = player;
        this.gameWorld = gameWorld;
    }

    public static void printGameExplanation() {
        String[] fakeLoadingLabels = {"Locating caverns", "Opening cavern door", "CHECKING FOR ECHO!", "ECHO", "CHO", "O", "Entering caverns"};
        int[] loadingTimes = {19, 10, 7, 5, 4, 2, 21};
        FakeLoading.fakeLoading(fakeLoadingLabels, loadingTimes);

        System.out.println(TextColor.MAGENTA + """
                
                Welcome to the fountain of objects!
                You are standing before a cavern system with multiple rooms/caverns.
                The rooms are ordered in a grid system.
                Somewhere in the caverns is the fountain of objects, it is your goal to get there, reactivate it and then move back to the cavern entrance.
                The caverns are to dark to see anything, so you will need to navigate on sound and smell.
                But watch out, in some rooms are endless pits, don't fall into them!
                Type the command what you want to do it.
                For example: type 'move north' to move one room up, or type 'enable fountain' when in the fountain room to activate the fountain.
                You can type help at any time to get a list of all available options.""" + TextColor.RESET);
    }

    public static int askForGameSize() {
        System.out.println(TextColor.MAGENTA + """
                
                How big do you want the game to be?
                Type the option you want:
                - 'small' for a 4x4 grid
                - 'medium' for a 6x6 grid
                - 'large' for a 8x8 grid""" + TextColor.RESET);

        String userInput;
        do {
            userInput = sc.nextLine();
        } while (!userInput.equalsIgnoreCase("small") && !userInput.equalsIgnoreCase("medium") && !userInput.equalsIgnoreCase("large"));

        return switch (userInput) {
            case "small" -> 4;
            case "medium" -> 6;
            case "large" -> 8;
            default -> 4;
        };
    }

    public void runCommand(String command) {
        switch (command.toLowerCase()) {
            case "help" -> printHelpMenu();
            case "exit" -> System.exit(0);
        }
    }

    public String[] getAllCommands() {
        return COMMANDS;
    }

    public String getUserInput(String question) {
        System.out.print(question);
        return sc.nextLine();
    }

    private void printHelpMenu() {
        System.out.println(TextColor.YELLOW + "----------------------------------------");
        System.out.println("You can perform the following actions:");

        ArrayList<String> allCurrentOptions = (getAllCurrentOptions(playersCurrentRoomType()));
        for (String command : allCurrentOptions) {
            System.out.println("- " + command);
        }
        System.out.println("----------------------------------------" + TextColor.RESET);
    }

    private RoomType playersCurrentRoomType() {
        return gameWorld.getRoomAt(player.getLocation());
    }

    private ArrayList<String> getAllCurrentOptions(RoomType playerCurrentRoomType) {
        ArrayList<String> allCurrentOptions = new ArrayList<>();

        allCurrentOptions.addAll(Arrays.asList(COMMANDS));
        allCurrentOptions.addAll(Arrays.asList(player.getAllCommands()));
        allCurrentOptions.addAll(gameWorld.getAvailableCommands(playerCurrentRoomType));

        return allCurrentOptions;
    }
    
    public void printPlayerLocation(int[] playerPositon) {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("You are in the room at (x=%d y=%d).\n", playerPositon[0], playerPositon[1]);
    }

    public void printRoomCondition(RoomType room, boolean fountainIsActive) {
        String text = switch (room) {
            case CAVERN_ENTRANCE -> TextColor.YELLOW + "You see light coming from the cavern entrance.";
            case FOUNTAIN -> (fountainIsActive) ? TextColor.CYAN + "You hear the rushing waters from the Fountain of Objects. It has been reactivated!" : TextColor.CYAN + "You hear water dripping in this room. The Fountain of Objects is here!";
            default -> TextColor.BLUE + "You see or hear nothing, its just cold and dark... This room is empty.";
        };
        System.out.println(text + TextColor.RESET);

        if (gameWorld.pittInNearbyRoom(player.getLocation())) {System.out.println(TextColor.BLUE + "There is a pit nearby");}
    }

    public void fellIntoAPitt() {
        System.out.println();
        String[] fallingIntoAPitt = {"You are falling into an endless pitt...", "You are still falling...", "Are we there yet?", "Did I turn off the stove?", "To fall or not to fall, that is the question", "It is getting really dark here", "Is this how astronauts feel?", "I'm getting hungry", "Would they deliver pizza here?", "nvm, I dont have cell reception here..."};
        FakeLoading.fakeLoading(fallingIntoAPitt, TextColor.RED.toString());
        System.out.println("\nSome legends say he is still falling. I'm wondering, did he get his pizza at the end?");
    }

    public void wonGame() {
        System.out.println(TextColor.YELLOW + """
                
                Congratulations!! You successfully reactivated the fountain and came back alive!
                Now there will be a big feast in the village in your honor!
                And there will be cake!""");
    }

}
