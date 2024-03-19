package playerguide.narrative0;

public class Challenge17 {
	public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String fireMode;
            if (i % 3 != 0 && i % 5 != 0) {
                fireMode = "Normal";
            }
            else if (i % 3 == 0) {
                if (i % 5 == 0) {
                    fireMode = "Big Boom";
                }
                else {
                    fireMode = "Fire";
                }
            }
            else {
                fireMode = "Electic";
            }
            
            System.out.println(i + ". " + fireMode);
        }
	}
}