package playerguide.narrative5.player;

public class Player {
    private int posRow;
    private int posColumn;
    private String[] playerCommands = {"move north", "move east", "move south", "move west"};

    public Player(int[] entrancePosition) {
        posRow = entrancePosition[0];
        posColumn = entrancePosition[1];

    }

    public void moveRow(int step) {
        posRow += step;
    }

    public void moveColumn(int step) {
        posColumn += step;
    }

    public boolean checkIfPlayerCommand(String userInput) {
        for (String command : playerCommands) {
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
        return new int[] {posRow, posColumn};
    }


}
