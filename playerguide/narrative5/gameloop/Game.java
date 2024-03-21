package playerguide.narrative5.gameloop;

import playerguide.narrative5.Commandable;
import playerguide.narrative5.exeptions.NoValidCommandExeption;
import playerguide.narrative5.gameworld.GameWorld;
import playerguide.narrative5.gameworld.RoomType;
import playerguide.narrative5.player.Player;

public class Game {
    GameTUI tui;
    GameWorld gameWorld;
    Player player;

    public Game() {
        gameWorld = new GameWorld();
        player = new Player(gameWorld.getEntrancePosition(), GameTUI.askForGameSize());
        tui = new GameTUI(player, gameWorld);
    }

    public void run() {
        while (!gameWorld.getFountainIsActivated() || !playerAtEntrance()) {
            tui.printPlayerLocation(player.getLocation());
            tui.printRoomCondition(gameWorld.getRoomAt(player.getLocation()), gameWorld.getFountainIsActivated());
            askUserForAction();
        }
    }

    private boolean playerAtEntrance() {
        return (playersCurrentRoomType().equals(RoomType.CAVERN_ENTRANCE));
    }

    private RoomType playersCurrentRoomType() {
        return gameWorld.getRoomAt(player.getLocation());
    }

    private void askUserForAction() {
        String userInput = tui.getUserInput("What do you want to do? ");

        Commandable commandableObj = null;
        do {
            try {
                commandableObj = whatKindOfCommand(userInput);
            } catch (NoValidCommandExeption e) {
                System.out.println("That is not a valid command, type help to see all the options.");
                userInput = tui.getUserInput("");
            }
        } while (commandableObj == null);

        runUserCommand(userInput, commandableObj);
    }


    /*
        how can i avoid having to declare a random kind of command
        trow an exeption?
     */
    private Commandable whatKindOfCommand(String userCommand) throws NoValidCommandExeption {
        for (String command : tui.getCommands()) {
            if (command.equalsIgnoreCase(userCommand)) {
                return tui;
            }
        }
        for (String command : player.getCommands()) {
            if (command.equalsIgnoreCase(userCommand)) {
                return player;
            }
        }
        for (String command : gameWorld.getCommands()) {
            if (command.equalsIgnoreCase(userCommand)) {
                return gameWorld;
            }
        }
        throw new NoValidCommandExeption();
    }

    private void runUserCommand(String command, Commandable obj) {
        obj.runCommand(command);
    }
}
