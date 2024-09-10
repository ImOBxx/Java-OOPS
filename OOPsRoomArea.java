

class Room {
    int length;
    int breadth;

    Room(int x, int y) {
        length = x;
        breadth = y;
    }

    int area() {
        return length * breadth;
    }
}

class BedRoom extends Room { // Inheriting Room
    int height;

    BedRoom(int x, int y, int z) {
        super(x, y); // Pass values to superclass
        height = z;
    }

    int volume() {
        return length * breadth * height;
    }
}

public class OOPsRoomArea {
    public static void main(String[] args) {
        BedRoom room1 = new BedRoom(14, 12, 10);
        int area = room1.area();     // Superclass method
        int volume = room1.volume(); // Subclass method
        System.out.println("Area = " + area);
        System.out.println("Volume = " + volume);
    }
}


