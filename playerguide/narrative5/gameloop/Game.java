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
    GameSize gameSize;

    public Game() {
        GameTUI.printGameExplanation();
        gameSize = GameTUI.askForGameSize();
        gameWorld = new GameWorld(gameSize.getGridSize(), gameSize.getNumberOfPitts());
        player = new Player(gameWorld.getEntrancePosition(), gameSize.getGridSize());
        tui = new GameTUI(player, gameWorld);
    }

    public void run() {
        while (!playersCurrentRoomType().equals(RoomType.PITT) && (!gameWorld.getFountainIsActivated() || !playerAtEntrance())) {
            tui.printPlayerLocation(player.getLocation());
            tui.printRoomCondition(gameWorld.getRoomAt(player.getLocation()), gameWorld.getFountainIsActivated());
            askUserForAction();
        }

        if (playersCurrentRoomType().equals(RoomType.PITT)) {
            tui.fellIntoAPitt();
        } else {
            tui.wonGame();
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

    private Commandable whatKindOfCommand(String userCommand) throws NoValidCommandExeption {
        for (String command : tui.getAllCommands()) {
            if (command.equalsIgnoreCase(userCommand)) {
                return tui;
            }
        }
        for (String command : player.getAllCommands()) {
            if (command.equalsIgnoreCase(userCommand)) {
                return player;
            }
        }
        for (String command : gameWorld.getAvailableCommands(playersCurrentRoomType())) {
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
