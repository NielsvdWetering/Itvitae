package playerguide.narrative2;

class Door {
    private static final int PIN_LENGTH = 4;
    private String pincode;
    private DoorState doorState = DoorState.CLOSED;
    
    public Door(String pincode){
        this.pincode = pincode;
    }
    
    
    public void openDoor() {
        switch (doorState) {
            case OPEN -> {
                System.out.println("The door is already open!");
            }
            case CLOSED -> {
                System.out.println("The door opens.");
                doorState = DoorState.OPEN;
            }
            case LOCKED -> {
                System.out.println("The door does not budge, it appears to be locked.");
            }
        }
    }
    
    
    public void closeDoor() {
        switch (doorState) {
            case OPEN :
                System.out.println("The door closes.");
                doorState = DoorState.CLOSED;
                break;
            case CLOSED :
            case LOCKED :
                System.out.println("The door is already closed");
                break;
        }
    }
    
    
    public void lockDoor() {
        switch (doorState) {
            case OPEN -> {
                System.out.println("You can't lock an open door.");
            }
            case CLOSED -> {
                System.out.println("The door clicks when its lock activates");
                doorState = DoorState.LOCKED;
            }
            case LOCKED -> {
                System.out.println("The door is already locked, locking it again wont make it more secure.");
            }
        }
    }
    
    
    public void unlockDoor(String pincode) {
        switch (doorState) {
            case OPEN -> {
                System.out.println("The door is already open, why would you want to unlock it?");
            }
            case CLOSED -> {
                System.out.println("The door is already unlocked.");
            }
            case LOCKED -> {
                if (checkPincode(pincode)) {
                    System.out.println("The door unlocks with a soft click.");
                    doorState = DoorState.CLOSED;
                } else {
                    System.out.println("Wrong Pincode!");
                }
            }
        }
    }
    
    
    public void changePincode(String oldPin, String newPin) {
        if (oldPin.equals(pincode)) {
            pincode = newPin;
            System.out.println("The pincode has been changed!");
        } else {
            System.out.println("Wrong password");
        }
    }
    
    
    private boolean checkPincode (String pincode) {
        return (pincode.equals(this.pincode));
    }
    
    
    public static boolean checkIfPinIsValid(String newPin) {
        if (newPin.length() != PIN_LENGTH) return false;
        
        for (char character : newPin.toCharArray()) {
            if (!Character.isDigit(character)) return false;
        }
        
        return true;
    }
    
    
}

enum DoorState {
    OPEN,
    CLOSED,
    LOCKED;
}