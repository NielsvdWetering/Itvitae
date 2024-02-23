package playerguide.narrative2;

class Card{
    final private Color color;
    final private Rank rank;
    
    public Card(Color color, Rank rank){
        this.color = color;
        this.rank = rank;
    }
    
    public Color getColor() {
        return color;
    }
    
    public Rank getRank() {
        return rank;
    }
    
    @Override
    public String toString() {
        return color + ", " + rank;
    }
}

enum Color{
    RED,
    GREEN,
    BLUE,
    YELLOW;
    
    @Override
    public String toString() {
        return super.toString().charAt(0) + super.toString().substring(1).toLowerCase();
    }
}

enum Rank{
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    DOLLAR,
    PERCENT,
    POWER_OF,
    AMPERSAND;
    
    @Override
    public String toString(){
        
        String niceName = super.toString().charAt(0) + super.toString().substring(1).toLowerCase();
            String name = "";
        for (int i = 0; i < niceName.length(); i++) {
            char c = (niceName.charAt(i) == '_') ? ' ' : niceName.charAt(i);
            name += c;  
        }
        return name;
    }
}