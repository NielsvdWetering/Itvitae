package playerguide.narrative1;

class Arrow {
    private int length;
    private ArrowHead head = ArrowHead.STEEL;
    private FletchingType fletching = FletchingType.PLASTIC;
    
    //constructor for standard arrows
    Arrow(int choice) {
        switch (choice) {
            case 1 -> createBeginnerArrow();
            case 2 -> createEliteArrow();
            case 3 -> createMarksmanArrow();
        }
    }
    
    //constructor for a custom arrow
    Arrow(int arrowHead, int arrowLength, int arrowFletcher) {
        
        switch (arrowHead) {
            case 1 -> head = ArrowHead.STEEL;
            case 2 -> head = ArrowHead.WOOD;
            case 3 -> head = ArrowHead.OBSIDIAN;
        }
        
        length = arrowLength;
        
        switch (arrowFletcher) {
            case 1 -> fletching = FletchingType.PLASTIC;
            case 2 -> fletching = FletchingType.TURKEY_FEATHERS;
            case 3 -> fletching = FletchingType.GOOSE_FEATHERS;
        }
    }
    
    public double getPrice() {
        return head.cost + fletching.cost + (0.05 * length);
    }
    
    private void createEliteArrow() {
        head = ArrowHead.STEEL;
        fletching = FletchingType.PLASTIC;
        length = 95;
    }
    
    private void createBeginnerArrow() {
        head = ArrowHead.WOOD;
        fletching = FletchingType.GOOSE_FEATHERS;
        length = 75;
    }
    
    private void createMarksmanArrow() {
        head = ArrowHead.STEEL;
        fletching = FletchingType.GOOSE_FEATHERS;
        length = 65;
    }
    
    enum ArrowHead {
        STEEL("Steel", 10),
        WOOD("Wood", 3),
        OBSIDIAN("Obsidian", 5);
        
        final int cost;
        final String material;
        ArrowHead(String material, int cost) {
            this.material = material;
            this.cost = cost;
        }
    }
    
    enum FletchingType {
        PLASTIC("Plastic", 10),
        TURKEY_FEATHERS("Turkey feathers", 5),
        GOOSE_FEATHERS("Goose feathers", 3);
        
        final int cost;
        final String material;
        FletchingType(String material, int cost) {
            this.material = material;
            this.cost = cost;
        }
    }

    public String getHead() {
        return head.material;
    }

    public String getFletching() {
        return fletching.material;
    }

    public int getLength() {
        return length;
    }
}