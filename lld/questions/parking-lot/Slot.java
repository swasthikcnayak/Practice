public class Slot {
    int slotId;
    Vehicle vehicle;
    SlotType slotType;

    public Slot(int slotId, SlotType slotType) {
    }

    public void occupy(Vehicle vehicle) {   
       this.vehicle = vehicle; 
    }

    public void vacate() {
        this.vehicle = null;
    }

    public void display(){
        // iwhat is happenign in this slot
    }
}