package lesopdrachten.week3;

import helperclasses.ConsoleHelper;

public class VelocityCalculator {
	public static void main(String[] args) {
        ConsoleHelper ch = new ConsoleHelper();
        
        int meters = ch.askForInteger("How many meters: ");
        int hours = ch.askForInteger("How many hours: ");
        int minutes = ch.askForInteger("How many minutes: ");
        int seconds = ch.askForInteger("How many seconds: ");
        
        double doubleHours = hours + (minutes / 60.0) + (seconds / 3600);
        minutes += hours * 60;
        seconds += minutes * 60;
        
        if (meterSecond(meters, seconds) >= 343) {System.out.println("Boom! You broke the sound barrier!");}
        System.out.println("The velocity in m/s is: " + meterSecond(meters, seconds));
        System.out.println("The velocity in km/h is: " + kilometerHour(meters, doubleHours));
        System.out.println("The velocity in mile/h is: " + mileHour(meters, doubleHours));
        
	}
    
    private static double meterSecond(int meters, int seconds) {
        return (double)meters / seconds;
    }
    
    private static double kilometerHour(int meters, double hours) {
        return (meters / 1000.0) / hours;
    }
    
    private static double mileHour(int meters, double hours) {
        return (meters / 1609.0) / hours;
    }
}