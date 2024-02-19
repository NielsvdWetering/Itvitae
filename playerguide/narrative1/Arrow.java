package playerguide.narrative1;

class Arrow {
    final private int length;
    final private ArrowHead head;
    final private FletchingType fletching;
    
    Arrow(ArrowHead head, int length, FletchingType fletching) {
        this.length = length;
        this.head = head;
        this.fletching = fletching;
    }
    
    public static Arrow createEliteArrow() {
        return new Arrow(ArrowHead.STEEL, 95, FletchingType.PLASTIC);
    }
    
    public static Arrow createBeginnerArrow() {
        return new Arrow(ArrowHead.WOOD, 75, FletchingType.GOOSE_FEATHERS);
    }
    
    public static Arrow createMarksmanArrow() {
        return new Arrow(ArrowHead.STEEL, 65, FletchingType.GOOSE_FEATHERS);
    }
    
    public double getPrice() {
        return head.cost + fletching.cost + (0.05 * length);
    }
    
    public String getHeadMaterial() {
        return head.niceName();
    }

    public String getFletchingMaterial() {
        return fletching.niceName();
    }

    public int getLength() {
        return length;
    }
}


enum ArrowHead {
    STEEL(10),
    WOOD(3),
    OBSIDIAN(5);
    
    final int cost;
    
    ArrowHead(int cost) {
        this.cost = cost;
    }
    
    public String niceName() {
        return toString().charAt(0) + toString().substring(1).toLowerCase();
    }
}
    
enum FletchingType {
    PLASTIC(10),
    TURKEY_FEATHERS(5),
    GOOSE_FEATHERS(3);
    
    final int cost;
    
    FletchingType(int cost) {
        this.cost = cost;
    }
    
    public String niceName() {
        String niceName = toString().charAt(0) + toString().substring(1).toLowerCase();
            String name = "";
        for (int i = 0; i < niceName.length(); i++) {
            char c = (niceName.charAt(i) == '_') ? ' ' : niceName.charAt(i);
            name += c;  
        }
        return name;
    }
}