package playerguide.narrative2;

import java.util.Scanner;
import helperclasses.ConsoleHelper;

public class Challenge31 {
    
    static boolean keepRunning = true;
    
	public static void main(String[] args) {
        
        System.out.println("Congratualtions! Here is your new door!");
        Door door = new Door(askForPin("Please enter a new pin code (4-digits):"));
        
        
        while (keepRunning) {
            menu(door);
        }
    }
    
    private static String askForPin(String question) {
        Scanner sc = new Scanner(System.in);
        boolean validPin;
        String Pin;
        do {
            System.out.println(question);
            Pin = sc.nextLine();
            validPin = Door.checkIfPinIsValid(Pin);
        } while (!validPin);
        
        return Pin;
    }
    
    private static void menu(Door door) {
        String[] options = {"Open door", "Close door", "Lock door", "Unlock door", "Change pincode", "Close program"};
        
        System.out.println();
        for (int option = 0; option < options.length; option++) {
            System.out.println((option+1) + "). " + options[option]);
        }
        
        int choice = ConsoleHelper.askForInteger("\nEnter your choice: ", 1, options.length);
        
        switch (choice) {
            case 1 -> door.openDoor();
            case 2 -> door.closeDoor();
            case 3 -> door.lockDoor();
            case 4 -> {
                String pin = askForPin("Please enter your pin:");
                door.unlockDoor(pin);
            }
            case 5 -> {
                String oldPin = askForPin("Please enter your pin:");
                String newPin = askForPin("Please enter a new pin code (4-digits):");
                door.changePincode(oldPin, newPin);
            }
            case 6 -> keepRunning = false;
        }
    }
    
}
