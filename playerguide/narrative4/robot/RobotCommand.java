package playerguide.narrative4.robot;

abstract class RobotCommand {
    
    public void run(Robot robot) {
        //
    }
}

class OnCommand extends RobotCommand {
    public void run(Robot robot) {
        robot.setPowered(true);
    }
}

class OffCommand extends RobotCommand {
    public void run(Robot robot) {
        robot.setPowered(false);
    }
}

class NorthCommand extends RobotCommand {
    public void run(Robot robot) {
        robot.moveY(1);
    }
}

class EastCommand extends RobotCommand {
    public void run(Robot robot) {
        robot.moveX(1);
    }
}

class SouthCommand extends RobotCommand {
    public void run(Robot robot) {
        robot.moveY(-1);
    }
}

class WestCommand extends RobotCommand {
    public void run(Robot robot) {
        robot.moveX(-1);
    }
}