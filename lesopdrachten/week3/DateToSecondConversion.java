package lesopdrachten.week3;

public class DateToSecondConversion {
	public static void main(String[] args) {
        final short SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_DAY = 86_400;
        final int SECONDS_IN_WEEK = 604_800;
        final int SECONDS_IN_MONTH = 2_419_200;
        final long SECONDS_IN_YEAR = 29_030_400L;
        
        short years = 20;
        byte months = 10;
        byte weeks = 5;
        byte days = 6;
        byte hours = 3;
        
        long totalSeconds = years*SECONDS_IN_YEAR + months*SECONDS_IN_MONTH + weeks*SECONDS_IN_WEEK + days*SECONDS_IN_DAY + hours*SECONDS_IN_HOUR;
        System.out.println("the total amount of seconds is: " + totalSeconds);
	}
}