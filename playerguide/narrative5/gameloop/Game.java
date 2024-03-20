package playerguide.narrative5.gameloop;

import playerguide.narrative5.Commandable;
import playerguide.narrative5.gameworld.GameWorld;
import playerguide.narrative5.gameworld.RoomType;
import playerguide.narrative5.player.Player;

public class Game {
    GameTUI tui = new GameTUI();
    GameWorld gameWorld;
    Player player;

    public Game() {
        gameWorld = new GameWorld();
        player = new Player(gameWorld.getEntrancePosition(), 4); //implement gamesize
    }

    public void run() {
        while (!gameWorld.getFountainIsActivated() || !playerAtEntrance()) {
            tui.printPlayerLocation(player.getLocation());
            tui.printRoomCondition(RoomType.EMPTY);
            String userInput = tui.getUserInput("What do you want to do?");
            doTheUserCommand(userInput);
        }
    }

    private boolean playerAtEntrance() {
        return (player.getPosX() == gameWorld.getEntrancePosition()[0] && player.getPosY() == gameWorld.getEntrancePosition()[1]);
    }

    private void doTheUserCommand(String userInput) {
        Commandable obj = whatKindOfCommand(userInput);
        runUserCommand(userInput, obj);
    }


    /*
        how can i avoid having to declare a random kind of command
        trow an exeption?
     */
    private Commandable whatKindOfCommand(String userCommand) {
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
        return gameWorld;
    }

    private void runUserCommand(String command, Commandable obj) {
        obj.runCommand(command);
    }
}
