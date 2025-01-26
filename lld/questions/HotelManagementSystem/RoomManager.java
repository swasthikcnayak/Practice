package Practice.lld.questions.HotelManagementSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomManager {
    List<Room> rooms;
    RoomFilterStrategy roomFilter;
    RoomPricingStrategy roomPricingStrategy;

    public RoomManager(List<Room> rooms) {
        this.rooms = rooms;
        Map<RoomType, Integer> pricing = new HashMap<RoomType, Integer>();
        pricing.put(RoomType.Deluxe, 10);
        roomPricingStrategy = new DayBasedPricingStrategy(pricing);
    }

    public List<Room> getRoomAvailability(RoomType roomType, int from, int to){
        // can use chain of responsibility here, create a chain and call the filter method
        roomFilter = new RoomFilterByType(roomType);
        List<Room> result = roomFilter.filter(rooms);
        roomFilter = new RoomFilterByDateAvailability(from, to);
        result = roomFilter.filter(result);
        return result;
    }

    public int getPrice(Room room, int from, int to){
        return roomPricingStrategy.calculatePrice(room, from, to);
    }
}
