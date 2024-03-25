package playerguide.narrative5.gameworld;

import playerguide.narrative5.Commandable;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class GameWorld  implements Commandable {
    Random rand = new Random();
    private final int gridSize;
    private final RoomType[][] gameGrid;
    private boolean fountainIsActivated;
    final private String[] COMMANDS = {"enable fountain", "disable fountain",};

    
    public GameWorld(int gridSize) {
        this.gridSize = gridSize;
        gameGrid = new RoomType[gridSize][gridSize];
        fountainIsActivated = false;
        fillRoomsWithEmpty();
        placeCavernEntrance();
        placeRoomAtRandomPlace(RoomType.FOUNTAIN);
        placeRoomAtRandomPlace(RoomType.PITT, 2); //make amount variable to gameSize

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

    private void placeRoomAtRandomPlace(RoomType roomType) {
        boolean roomPlaced = false;
        while (!roomPlaced) {
            int x = rand.nextInt(gridSize);
            int y = rand.nextInt(gridSize);

            if (gameGrid[x][y].equals(RoomType.EMPTY)) {
                gameGrid[x][y] = roomType;
                roomPlaced = true;
            }
        }
    }

    private void placeRoomAtRandomPlace(RoomType roomtype, int amountOfRooms) {
        for (int i = 0; i < amountOfRooms; i++) {
            placeRoomAtRandomPlace(roomtype);
        }
    }

    public int[] getEntrancePosition() {
        return new int[]{0,0};
    }

    public void runCommand(String command) {
        switch (command.toLowerCase()) {
            case "enable fountain" -> fountainIsActivated = true;
            case "disable fountain" -> fountainIsActivated = false;
        }
    }

    public String[] getAllCommands() {
        return COMMANDS;
    }

    public ArrayList<String> getAvailableCommands(RoomType playerCurrentRoomType) {
        ArrayList<String> availableCommands = new ArrayList<>();
        if (playerCurrentRoomType == RoomType.FOUNTAIN) {
            availableCommands.addAll(Arrays.asList(COMMANDS));
        }
        return availableCommands;
    }

    public boolean getFountainIsActivated() {
        return fountainIsActivated;
    }

    public RoomType getRoomAt(int[] gridLocationXY) {
        return gameGrid[gridLocationXY[0]][gridLocationXY[1]];
    }

    public boolean pittInNearbyRoom(int[] playerLocation) {

        for (int xLocation = playerLocation[0]-1; xLocation <= playerLocation[0]+1; xLocation++) {
            if (xLocation >= 0 && xLocation < gridSize) {
                for (int yLocation = playerLocation[1] - 1; yLocation <= playerLocation[1] + 1; yLocation++) {
                    if (yLocation >= 0 && yLocation < gridSize) {
                        if (gameGrid[xLocation][yLocation].equals(RoomType.PITT)) return true;
                    }
                }
            }
        }
        return false;
    }

    public int getGameSize() {
        return gridSize;
    }
}
