package playerguide.narrative5.gameloop;

public enum GameSize {
    SMALL(4,1),
    MEDIUM(6,2),
    LARGE(8,3);

    private int gridSize;
    private int numberOfPitts;

    GameSize(int gridSize, int numberOfPitts) {
        this.gridSize = gridSize;
        this.numberOfPitts = numberOfPitts;
    }

    public int getGridSize() {
        return gridSize;
    }

    public int getNumberOfPitts() {
        return numberOfPitts;
    }
}
