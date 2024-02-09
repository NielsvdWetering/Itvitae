package playerguide;

import helperclasses.ConsoleHelper;

class HuntingTheManticore {
    final int CITY_MAX_HEALTH = 15;
    final int MANTICORE_MAX_HEALTH = 10;
    
    private int manticoreHealth;
    private int cityHealth;
    private int manticoreRange;
    private int round;
    
    ConsoleHelper ch = new ConsoleHelper();
    
    //user-defined constructor
    HuntingTheManticore() {
        cityHealth = CITY_MAX_HEALTH;
        manticoreHealth = MANTICORE_MAX_HEALTH;
        round = 1;
        manticoreRange = ch.askForInteger("Pilot of the manticore! At what range of the city do you want to be? (enter a integer value between 0 and 100)\n", 0, 100);
        for (int i = 0; i < 50; i++) System.out.println();
        System.out.println("Defenders of the city! \nOur cannon has a range of 0 to 100! \nAnd the manticore has come into range! \nDefend the city at all cost!");
    }
    
    //returns the damage of the cannon this round
    int magicCannon() {
        if (round % 3 == 0 && round % 5 == 0) return 10;
        if (round % 3 == 0 || round % 5 ==0) return 3;
        return 1;
    }
    
    //methode that prints the score screen
    void printStatus() {
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("STATUS: Round: %d  City: %d/%d  Manticore: %d/%d\n", round, cityHealth, CITY_MAX_HEALTH, manticoreHealth, MANTICORE_MAX_HEALTH);
        System.out.println("The cannon is expected to do " + magicCannon() + " damage this round");
    }
    
    //methode that asks for range and prints if it hit
    void shoot() {
        int range = ch.askForInteger("Enter desired cannon range: ", 0, 100);
        System.out.println("That round " + hitOrMis(range));
    }
    
    //methode that checks if the shot was hit and deducts the damage points fromt the manticore health
    private String hitOrMis(int range) {
        if (range == manticoreRange) {
            manticoreHealth -= magicCannon();
            return "was a DIRECT HIT!";
        } else {
            if (range < manticoreRange) return "FELL SHORT of the target!";
            return "OVERSHOT the target!";
        }
    }
    
    //getters and setters
    void setRound(int newRound) {
        round = newRound;
    }
    
    int getRound() {
        return round;
    }
    
    int getCityHealth() {
        return cityHealth;
    }
    
    void setCityHealth(int newCityHealth) {
        cityHealth = newCityHealth;
    }
    
    int getManticoreHealth() {
        return manticoreHealth;
    }
    
    
}