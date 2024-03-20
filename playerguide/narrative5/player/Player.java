package playerguide.narrative5.player;

import playerguide.narrative5.Commandable;

public class Player implements Commandable {
    private int posX;
    private int posY;
    final private int gameSize;
    final private String[] COMMANDS = {"move north", "move east", "move south", "move west"};

    public Player(int[] entrancePosition, int gameSize) {
        posX = entrancePosition[0];
        posY = entrancePosition[1];
        this.gameSize = gameSize;
    }

    public void moveX(int step) {
        posX += step;
    }

    public void moveY(int step) {
        posY += step;
    }

    public void runCommand(String command) {
        switch (command.toLowerCase()) {
            case "move north" -> moveNorth();
            case "move east" -> moveEast();
            case "move south" -> moveSouth();
            case "move west" -> moveWest();
            }
    }

    public String[] getCommands() {
        return COMMANDS;
    }

    private void moveNorth() {
        if (posY < gameSize - 1) {
            posY += 1;
        }
    }

    private void moveEast() {
        if (posX < gameSize - 1) {
            posX += 1;
        }
    }

    private void moveSouth() {
        if (posY > 0) {
            posY -= 1;
        }
    }

    private void moveWest() {
        if (posX > 0) {
            posX -= 1;
        }
    }

    public int[] getLocation() {
        return new int[] {posX, posY};
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}
