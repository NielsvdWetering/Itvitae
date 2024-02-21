package playerguide.narrative2;

public class Challenge29 {
    public static void main(String[] args) {
        Color brown = new Color(119, 98, 77);
        Color blue = new Color("BLUE");
        
        printValues("Brown", brown.getColor());
        printValues("Blue", blue.getColor());
        printValues("green", Color.GREEN);
    }
    
    private static void printValues(String color, int[] colorValues) {
        System.out.printf("The rgb values of %s is: r:%d, g:%d, b:%d.\n", color, colorValues[0], colorValues[1], colorValues[2]);
    }
    
}