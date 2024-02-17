package playerguide.narrative1;

import helperclasses.ConsoleHelper;

public class Challenge25 {
    
    public static void main(String[] args) {
        int choice = menu();
        Arrow arrow = null;
        if (choice == 4) {
            arrow = createCustomArrow();
        } else {
            arrow = new Arrow(choice);
        }

        System.out.println("Here is the arrow:");
        System.out.println("*Arrow with a head made of " + arrow.getHead() + ", " + arrow.getFletching() + " tail and with a length of " + arrow.getLength() + " cm*");
        System.out.println("The cost of this arrow is: " + arrow.getPrice() + " Gold");
    }
    
    private static int menu() {
        ConsoleHelper ch = new ConsoleHelper();
        
        System.out.println("Welcome to Vin Fletcher's Arrows!");
        System.out.println("""
        We have the following types of arrows available:
        1). Beginner arrow.
        2). Elite arrow.
        3). Marksman arrow.
        4). Custom arrow.
        """);
        return ch.askForInteger("\nPlease enter your choice: ", 1, 4);
    }
    
    private static Arrow createCustomArrow() {
        int head = chooseArrowHead();
        int length = chooseArrowLength();
        int fletcher = chooseArrowFletcher();
        return new Arrow(head, length, fletcher);
    }
    
    private static int chooseArrowHead() {
        ConsoleHelper ch = new ConsoleHelper();
        
        System.out.println("""
        We have the following options as arrow head:
        1). Steel.
        2). Wood.
        3). Obsidian.
        """);
        return ch.askForInteger("\nPlease enter your choice: ", 1, 3);
    }
    
    private static int chooseArrowLength() {
        ConsoleHelper ch = new ConsoleHelper();
        
        return ch.askForInteger("How long do you want the shaft to be (between 60 and 100 cm): ", 60, 100);
    }
    
    private static int chooseArrowFletcher() {
        ConsoleHelper ch = new ConsoleHelper();
        
        System.out.println();
        System.out.println("""
        We have the following options as arrow fletcher:
        1). Plastic.
        2). Turkey feathers.
        3). Goose feathers.
        """);
        return ch.askForInteger("\nPlease enter your choice: ", 1, 3);
    }
}