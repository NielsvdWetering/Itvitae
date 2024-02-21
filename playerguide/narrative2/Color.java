package playerguide.narrative2;

class Color {
    private int[] rgb = new int[3];
    
    final static int[] WHITE = {255, 255, 255};
    final static int[] BLACK = {0, 0, 0};
    final static int[] RED = {255, 0, 0};
    final static int[] ORANGE = {255, 165, 0};
    final static int[] YELLOW = {255, 255, 0};
    final static int[] GREEN = {0, 128, 0};
    final static int[] BLUE = {0, 0, 255};
    final static int[] PURPLE = {128, 0, 128};
    
    Color (int r, int g, int b) {
        rgb[0] = r;
        rgb[1] = g;
        rgb[2] = b;
    }
    
    Color (String color) {
        rgb = switch(color) {
            case "WHITE" -> WHITE;
            case "BLACK" -> BLACK;
            case "RED" -> RED;
            case "ORANGE" -> ORANGE;
            case "YELLOW" -> YELLOW;
            case "GREEN" -> GREEN;
            case "BLUE" -> BLUE;
            case "PURPLE" -> PURPLE;
            default -> throw new IllegalArgumentException();
        };
    }
    
    public int[] getColor() {
        return rgb;
    }
}