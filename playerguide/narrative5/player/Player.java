package playerguide.narrative5.player;

public class Player {
    private int posX;
    private int posY;
    final private String[] PLAYER_COMMANDS = {"move north", "move east", "move south", "move west"};

    public Player(int[] entrancePosition) {
        posX = entrancePosition[0];
        posY = entrancePosition[1];

    }

    public void moveX(int step) {
        posX += step;
    }

    public void moveY(int step) {
        posY += step;
    }

    public boolean checkIfPlayerCommand(String userInput) {
        for (String command : PLAYER_COMMANDS) {
            if (userInput.equalsIgnoreCase(command)) return true;
        }
        return false;
    }

    public void runPlayerCommand(String userInput) {
        run(setCommand(userInput));
    }

    private PlayerCommand setCommand(String userInput) {
        switch (userInput.toLowerCase()) {
            case "move north" : return new MoveNorthCommand();
            case "move east" : return new MoveEastCommand();
            case "move south" : return new MoveSouthCommand();
            case "move west" : return new MoveWestCommand();
        }
        return new WrongInputCommand();
    }

    private void run(PlayerCommand command) {
        command.runCommand(this);
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
