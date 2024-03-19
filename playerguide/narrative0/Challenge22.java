package playerguide.narrative0;

import playerguide.narrative0.HuntingTheManticore;

public class Challenge22 {
    public static void main(String[] args) {
        HuntingTheManticore hm = new HuntingTheManticore();
        
        while (hm.getCityHealth() > 0) {
            hm.printStatus();
            hm.shoot();
            if (hm.getManticoreHealth() <= 0) break;
            hm.setCityHealth(hm.getCityHealth() - 1);
            hm.setRound(hm.getRound() + 1);
        }
        
        if (hm.getCityHealth() <= 0) {
            System.out.println("The city is reduced to rubles!\nHe manticore pilot wins!");
        } else {
            System.out.println("\nThe manticore has been destroyed!\nThe city is safe!");
        }
    }
}