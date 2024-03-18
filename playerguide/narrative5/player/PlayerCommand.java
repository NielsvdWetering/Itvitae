package playerguide.narrative5.player;

public interface PlayerCommand {
    public void runCommand(Player player);
}

class MoveNorthCommand implements PlayerCommand {
    @Override
    public void runCommand(Player player) {
        player.moveColumn(1);
    }
}

class MoveEastCommand implements PlayerCommand {
    @Override
    public void runCommand(Player player) {
        player.moveRow(1);
    }
}

class MoveSouthCommand implements PlayerCommand {
    @Override
    public void runCommand(Player player) {
        player.moveColumn(-1);
    }
}

class MoveWestCommand implements PlayerCommand {
    @Override
    public void runCommand(Player player) {
        player.moveRow(-1);
    }
}

class WrongInputCommand implements PlayerCommand {
    @Override
    public void runCommand(Player player) {
        System.out.println("That was not a valid option for your character.\n*Not sure what to do, you keep standing still in the same room.*");
    }
}
