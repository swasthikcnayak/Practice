package Practice.lld.questions.HotelManagementSystem;

import java.util.Map;

public interface RoomPricingStrategy {
    public int calculatePrice(Room room, int from, int to);
}

class DayBasedPricingStrategy implements RoomPricingStrategy{

    Map<RoomType, Integer> priceChart;

    DayBasedPricingStrategy(Map<RoomType, Integer> priceChart){
        this.priceChart = priceChart;
    }

    @Override
    public int calculatePrice(Room room, int from, int to) {
        int price = priceChart.get(room.roomType);
        return price*(to-from);
    }
    
}
