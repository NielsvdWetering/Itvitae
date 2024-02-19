package playerguide.narrative1;

import helperclasses.ConsoleHelper;

public class Challenge25 {
    
    public static void main(String[] args) {
        int choice = menu();
        Arrow arrow = switch (choice) {
            case 1 -> Arrow.createBeginnerArrow();
            case 2 -> Arrow.createEliteArrow();
            case 3 -> Arrow.createMarksmanArrow();
            case 4 -> createCustomArrow();
            default -> throw new IllegalArgumentException();
        };
        
        System.out.println("Here is the arrow:");
        System.out.println("*Arrow with a head made of " + arrow.getHeadMaterial() + ", " + arrow.getFletchingMaterial() + " tail and with a length of " + arrow.getLength() + " cm*");
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
        ArrowHead head = chooseArrowHead();
        int length = chooseArrowLength();
        FletchingType fletching = chooseArrowFletcher();
        return new Arrow(head, length, fletching);
    }
    
    private static ArrowHead chooseArrowHead() {
        ConsoleHelper ch = new ConsoleHelper();
        
        ArrowHead[] options = ArrowHead.values();
        for (ArrowHead option : options) {
            System.out.println((option.ordinal() + 1) + "). " + option.niceName());
        }
        
        int choice = ch.askForInteger("Enter your choice: ");
        return options[choice - 1];
    }
    
    private static int chooseArrowLength() {
        ConsoleHelper ch = new ConsoleHelper();
        
        return ch.askForInteger("How long do you want the shaft to be (between 60 and 100 cm): ", 60, 100);
    }
    
    private static FletchingType chooseArrowFletcher() {
        ConsoleHelper ch = new ConsoleHelper();
        
        FletchingType[] options = FletchingType.values();
        for (FletchingType option : options) {
            System.out.println((option.ordinal() + 1) + "). " + option.niceName());
        }
        
        int choice = ch.askForInteger("\nEnter your choice: ");
        return options[choice - 1];
    }
}