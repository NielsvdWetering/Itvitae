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
        tui.askAndRunUserActions();
        tui.askAndRunUserActions();
        tui.askAndRunUserActions();
        tui.askAndRunUserActions();
        int[] loc = player.getLocation();
        System.out.println(loc[0] + " " + loc[1]);
        //print
        //ask input
        //run input logica
    }

}
