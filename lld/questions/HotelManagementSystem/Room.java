package Practice.lld.questions.HotelManagementSystem;

import java.util.List;

enum RoomType{
    Single,
    Double,
    Semi_Deluxe,
    Deluxe,
    Luxury
}

class Calendar{
    List<int[]> bookingInterval;
}

public class Room {
    RoomType roomType;
    int occupancy;
    int room_number;
    Calendar calendar;

    public Room(RoomType roomType, int occupancy, int room_number, Calendar calendar) {
        this.roomType = roomType;
        this.occupancy = occupancy;
        this.room_number = room_number;
    }
}
