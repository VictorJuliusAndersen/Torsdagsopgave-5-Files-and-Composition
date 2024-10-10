package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room r1 = new Room(2,8);
        Room r2 = new Room(5,3);
        Room r3 = new Room(8,12);


        ArrayList<Room>rooms = new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);

        Building b1 = new Building(3, rooms);

        int totalLamps = countLampsInBuilding(b1);
        System.out.println("Total lamps: " + totalLamps);

        int totalWindows = countWindowsInBuilding(b1);
        System.out.println("Total Windows: " + totalWindows);

        int totalRooms = countRoomsInBuilding(b1);
        System.out.println("Total rooms: " + totalRooms);

        boolean normal = isNormal(b1);
        System.out.println("Building is " + normal);
    }

    private static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    private static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for (Room room : building.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    private static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }

    private static boolean isNormal(Building building) {

        if(building.getNumberOfFloors() >= countRoomsInBuilding(building)) {
            return true;
        }
        return false;
    }
}