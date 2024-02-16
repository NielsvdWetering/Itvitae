package playerguide;

import java.util.Scanner;

public class Challenge23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChestState chestState = ChestState.LOCKED;
        
        while (true) {
            System.out.println("The chest is " +  chestState + ". What do you want to do? ");
            String userAction = sc.nextLine();
            
            switch (chestState) {
                case OPEN -> {
                    if (userAction.equalsIgnoreCase("close")) {
                        chestState = ChestState.CLOSED;
                    } else {
                        printNotPossible();
                    }
                }
                case CLOSED -> {
                    if (userAction.equalsIgnoreCase("open")) {
                        chestState = ChestState.OPEN;
                    } else if (userAction.equalsIgnoreCase("lock")) {
                        chestState = ChestState.LOCKED;
                    } else {
                        printNotPossible();
                    }
                }
                case LOCKED -> {
                    if (userAction.equalsIgnoreCase("unlock")) {
                        chestState = ChestState.CLOSED;
                    } else {
                        printNotPossible();
                    }
                }
            }
            
        }
    }
    
    private static void printNotPossible() {
        System.out.println("That is not possible at this time");
    }
}


enum ChestState {
    OPEN,
    CLOSED,
    LOCKED;
}