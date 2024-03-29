package playerguide.narrative2;

class Point {
    final private int x;
    final private int y;
    
    Point() {
        x = 0;
        y = 0;
    }
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    @Override
    public String toString() {
        return "(x = " + x + ", y = " + y + ")";
    }
}