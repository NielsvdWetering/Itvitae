package playerguide.narrative5.player;

import playerguide.narrative5.Commandable;
import playerguide.narrative5.gameloop.GameTUI;

public class Player implements Commandable {
    private int posX;
    private int posY;
    final private int gridSize;
    final private String[] COMMANDS = {"move north", "move east", "move south", "move west"};

    public Player(int[] entrancePosition, int gameSize) {
        posX = entrancePosition[0];
        posY = entrancePosition[1];
        this.gridSize = gameSize;
    }

    public void runCommand(String command) {
        switch (command.toLowerCase()) {
            case "move north" -> moveNorth();
            case "move east" -> moveEast();
            case "move south" -> moveSouth();
            case "move west" -> moveWest();
            }
    }

    public String[] getAllCommands() {
        return COMMANDS;
    }

    private void moveNorth() {
        if (posY < gridSize - 1) {
            posY += 1;
        } else {
            GameTUI.bumpedIntoWall();
        }
    }

    private void moveEast() {
        if (posX < gridSize - 1) {
            posX += 1;
        } else {
            GameTUI.bumpedIntoWall();
        }
    }

    private void moveSouth() {
        if (posY > 0) {
            posY -= 1;
        } else {
            GameTUI.bumpedIntoWall();
        }
    }

    private void moveWest() {
        if (posX > 0) {
            posX -= 1;
        } else {
            GameTUI.bumpedIntoWall();
        }
    }

    public int[] getLocation() {
        return new int[] {posX, posY};
    }


}
