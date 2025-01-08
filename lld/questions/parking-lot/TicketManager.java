public class TicketManager {
   SlotManager slotManager;

    Ticket createTicket(Vehicle vehicle, int entryTime, TicketPricingStrategy strategy){
        Slot slot = slotManager.allot(vehicle.vehicleType);
        return new Ticket(entryTime, vehicle, slot, strategy);
    }
}
