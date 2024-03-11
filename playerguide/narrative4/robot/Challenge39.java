package playerguide.narrative4.robot;

import java.util.Scanner;
import java.util.ArrayList;

public class Challenge39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<RobotCommand> commands = new ArrayList<>();
        
        System.out.println("Enter commands:");
        
        for (int command = 0; command < 3; command++) {
            String commandInput = sc.nextLine();
            commands.add(createCommand(commandInput));
        }

        Robot bob = new Robot(commands);
        bob.run();
        
    }
    
    private static RobotCommand createCommand(String commandInput) {
        switch(commandInput.toLowerCase()) {
            case "on" :
                return new OnCommand();
            case "north" :
                return new NorthCommand();
            case "east" :
                return new EastCommand();
            case "south" :
                return new SouthCommand();
            case "west" :
                return new WestCommand();
            default :
                System.out.println("That was not a valid command, the robot will be shut off.");
            case "off" :
                return new OffCommand();
        }
    }

}