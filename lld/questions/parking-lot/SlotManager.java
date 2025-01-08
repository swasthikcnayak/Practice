import java.util.List;

public class SlotManager {
    List<Slot> slots;
    SlotAllotmentStrategy strategy;

    Slot allot(int vehicleType){
        return strategy.allot(slots, vehicleType);
    }

    void returnSlot(Slot slot){
        slots.add(slot);
    }
}

interface SlotAllotmentStrategy{
    Slot allot(List<Slot> slots, int vehicleType);
}

class FirstSlotAllotmentStrategy implements SlotAllotmentStrategy{
    @Override
    public Slot allot(List<Slot> slots, int vehicleType) {
        return slots.get(0);
    }
}