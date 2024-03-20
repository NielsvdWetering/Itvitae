package playerguide.narrative5.gameworld;

import playerguide.narrative5.gameloop.GameTUI;

public class GameWorld {
    private int gridSize;
    private RoomType[][] gameGrid;
    private boolean fountainIsActivated;
    final private String[] WORLD_COMMANDS = {"enable fountain", "disable fountain",};

    
    public GameWorld() {
        gridSize = GameTUI.askForGameSize();
        gameGrid = new RoomType[gridSize][gridSize];
        fountainIsActivated = false;
        fillRoomsWithEmpty();
        placeCavernEntrance();
        placeFountain();

    }

    private void fillRoomsWithEmpty(){
        for (int x = 0; x < gridSize; x++) {
            for (int y = 0; y < gridSize; y++) {
                gameGrid[x][y] = RoomType.EMPTY;
            }
        }
    }

    public void placeCavernEntrance() {
        gameGrid[0][0] = RoomType.CAVERN_ENTRANCE;
    }

    private void placeFountain() {
        gameGrid[0][2] = RoomType.FOUNTAIN;
    }

    private void placePitts() {
        //place pitts
    }

    public int[] getEntrancePosition() {
        return new int[]{0,0};
    }

    public boolean checkIfGameWorldCommand(String userInput) {
        for (String command : WORLD_COMMANDS) {
            if (userInput.equalsIgnoreCase(command)) return true;
        }
        return false;
    }

    public void runGameWorldCommand(String userInput) {
        switch (userInput.toLowerCase()) {
            case "enable fountain" -> fountainIsActivated = true;
            case "disable fountain" -> fountainIsActivated = false;
        }
    }

    public boolean getFountainIsActivated() {
        return fountainIsActivated;
    }

    public RoomType getRoomAt(int[] gridLocationXY) {
        return gameGrid[gridLocationXY[0]][gridLocationXY[1]];
    }
}
