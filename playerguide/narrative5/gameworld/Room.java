package playerguide.narrative5.gameworld;

class Room {
    private RoomType roomType;

    public Room(RoomType roomType){
        this.roomType = roomType;
    }

    public void printRoom() {
        System.out.println(roomType);
    }
}

