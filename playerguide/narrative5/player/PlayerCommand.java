package playerguide.narrative5.player;

interface PlayerCommand {
    public void runCommand(Player player);
}

class MoveNorthCommand implements PlayerCommand {
    //nog aanpassen met gridsize
    @Override
    public void runCommand(Player player) {
        if (player.getPosY() < 3) {
            player.moveY(1);
        }
    }
}

class MoveEastCommand implements PlayerCommand {
    @Override
    public void runCommand(Player player) {
        if (player.getPosX() < 3) {
            player.moveX(1);
        }
    }
}

class MoveSouthCommand implements PlayerCommand {
    @Override
    public void runCommand(Player player) {
        if (player.getPosY() > 0) {
            player.moveY(-1);
        }
    }
}

class MoveWestCommand implements PlayerCommand {
    @Override
    public void runCommand(Player player) {
        if (player.getPosX() > 0) {
            player.moveX(-1);
        }
    }
}

class WrongInputCommand implements PlayerCommand {
    @Override
    public void runCommand(Player player) {
        System.out.println("That was not a valid option for your character.\n*Not sure what to do, you keep standing still in the same room.*");
    }
}
