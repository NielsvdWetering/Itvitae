package playerguide.narrative5.gameworld;

import java.util.Objects;

public class GameWorld {
    private int gridSize = 4;
    private Room[][] gameGrid = new Room[gridSize][gridSize];
    private boolean fountainIsActivated;

    
    public GameWorld() {
        fountainIsActivated = false;
        placeCavernEntrance();
        placeFountain();
        fillRemainingRoomsWithEmpty();
    }

    public void placeCavernEntrance() {
        gameGrid[0][0] = new Room(RoomType.CAVERN_ENTRANCE);
    }

    private void placeFountain() {
        gameGrid[0][2] = new Room(RoomType.FOUNTAIN);
    }

    private void placePitts() {
        //place pitts
    }

    private void fillRemainingRoomsWithEmpty(){
        for (int row = 0; row < gridSize; row++) {
            for (int column = 0; column < gridSize; column++) {
                if (checkIfRoomExists(row, column)) {
                    gameGrid[row][column] = new Room(RoomType.EMPTY);
                }
            }

        }
    }

    private boolean checkIfRoomExists(int row, int column) {
        return Objects.isNull(gameGrid[row][column]);
    }

    public int[] getEntrancePosition() {
        return new int[]{0,0};
    }

    public boolean checkIfGameWorldCommand(String userInput) {
        return false;
    }

    public void runGameWorldCommand(String userInput) {
        //
    }
}
