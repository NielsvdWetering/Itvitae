package helperclasses;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class FakeLoading {
    static Random rnd = new Random();

    public static void fakeLoading(String loadingText, int delayInMilliSeconds, String textAndBackgroundColor) {//1000 milliseconds is 1 second (results in 50 second till 100%)
        String loadingBar = "";
        for (int percent = 0; percent <=100; percent+=2) {
            System.out.printf("\r%s%-21s[%-50s]%s%%%s",textAndBackgroundColor, loadingText, loadingBar, percent, TextColor.RESET);
            loadingBar += "#";
            try {
                TimeUnit.MILLISECONDS.sleep(delayInMilliSeconds);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }

    public static void fakeLoading(String loadingText, int delayInMilliSeconds) {
        fakeLoading(loadingText, delayInMilliSeconds, "");
    }

    public static void fakeLoading(String loadingText) {
        fakeLoading(loadingText, randomTime(), "");
    }

    public static void fakeLoading(String[] loadingTextArray, int[] fakeLoadingTimes, String[] textAndBackgroundColor) {
        for (int i = 0; i < loadingTextArray.length; i++) {
            fakeLoading(loadingTextArray[i], fakeLoadingTimes[i], textAndBackgroundColor[i]);
        }
    }

    public static void fakeLoading(String[] loadingTextArray, int[] fakeLoadingTimes) {
        for (int i = 0; i < loadingTextArray.length; i++) {
            fakeLoading(loadingTextArray[i], fakeLoadingTimes[i]);
        }
    }

    public static void fakeLoading(String[] loadingTextArray) {
        for (String text : loadingTextArray) {
            fakeLoading(text);
        }
    }

    public static void fakeLoading(String[] loadingTextArray, String[] textAndBackgroundColor) {
        for (int i = 0; i < loadingTextArray.length; i++) {
            fakeLoading(loadingTextArray[i], randomTime(), textAndBackgroundColor[i]);
        }
    }

    private static int randomTime() {
        //giving it a little bit more tendency to be a bit shorter rather than longer
        int time1 = rnd.nextInt(10, 300);
        int time2 = rnd.nextInt(10, 300);
        return Math.min(time1, time2);
    }

}
