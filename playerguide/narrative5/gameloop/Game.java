package playerguide.narrative5.gameloop;

import playerguide.narrative5.gameworld.GameWorld;
import playerguide.narrative5.player.Player;

public class Game {
    GameTUI tui;
    GameWorld gameWorld;
    Player player;

    public Game() {
        gameWorld = new GameWorld();
        player = new Player(gameWorld.getEntrancePosition());
        tui = new GameTUI(player, gameWorld);
    }

    public void run() {
        while (!gameWorld.getFountainIsActivated() || !playerAtEntrance()) {
            tui.printPlayerLocation();
            tui.printRoomCondition();
            tui.askAndRunUserActions();
        }
    }

    private boolean playerAtEntrance() {
        return (player.getPosX() == gameWorld.getEntrancePosition()[0] && player.getPosY() == gameWorld.getEntrancePosition()[1]);
    }

}
