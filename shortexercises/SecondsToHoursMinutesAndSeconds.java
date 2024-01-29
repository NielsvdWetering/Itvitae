import java.util.Scanner;

public class SecondsToHoursMinutesAndSeconds {
	public static void main(String[] args) {
        int hours;
        int minutes;
        int seconds;
        int secondsInput;
        
        System.out.print("How many seconds? ");
        secondsInput = intInput();
        hours = secondsInput / 3600;
        secondsInput = secondsInput % 3600;
        minutes = secondsInput / 60;
        seconds = secondsInput % 60;
        System.out.println(hours + ":"+ minutes + ":" + seconds);
	}
    
    public static int intInput() {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        return input;
    }
}