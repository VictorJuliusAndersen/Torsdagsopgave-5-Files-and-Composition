package Task3;

import java.util.ArrayList;

public class Building {
    private int numberOfFloors;
    private ArrayList<Room>rooms = new ArrayList<>();

    public Building(int numberOfFloors, ArrayList<Room>rooms){
     this.numberOfFloors = numberOfFloors;
     this.rooms = rooms;
        
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}
