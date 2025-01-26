package Practice.lld.questions.HotelManagementSystem;

import java.util.List;

public interface RoomFilterStrategy {
    public List<Room> filter(List<Room> rooms);
}

class RoomFilterByType implements RoomFilterStrategy {
    RoomType roomType;

    public RoomFilterByType(RoomType roomType) {
        this.roomType = roomType;
    }
    public List<Room> filter(List<Room> rooms) {
        return rooms.stream().filter(room -> room.roomType.equals(roomType)).toList();
    }
}

class RoomFilterByDateAvailability implements RoomFilterStrategy {
    int from;
    int to;
    public RoomFilterByDateAvailability(int from, int to) {
        this.from = from;
        this.to  = to;
    }
    public List<Room> filter(List<Room> rooms) {
        return rooms.stream().filter((room)->{
            // get the calendar, fetch if available,
            return true;
        }).toList();
    }
}

