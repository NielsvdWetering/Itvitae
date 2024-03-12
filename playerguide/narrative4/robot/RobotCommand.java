package playerguide.narrative4.robot;

interface RobotCommand {
    void run(Robot robot);
}


/* challenge 39 code
not used after converting to robotCommand interface in challenge 40

abstract class RobotCommand {
    
    public void run(Robot robot) {
        //
    }
}
*/

class OnCommand implements RobotCommand {
    public void run(Robot robot) {
        robot.setPowered(true);
    }
}

class OffCommand implements RobotCommand {
    public void run(Robot robot) {
        robot.setPowered(false);
    }
}

class NorthCommand implements RobotCommand {
    public void run(Robot robot) {
        robot.moveY(1);
    }
}

class EastCommand implements RobotCommand {
    public void run(Robot robot) {
        robot.moveX(1);
    }
}

class SouthCommand implements RobotCommand {
    public void run(Robot robot) {
        robot.moveY(-1);
    }
}

class WestCommand implements RobotCommand {
    public void run(Robot robot) {
        robot.moveX(-1);
    }
}
