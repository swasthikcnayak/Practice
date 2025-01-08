public class Ticket {
    int entryTime;
    Vehicle vehicle;
    Slot slot;
    TicketPricingStrategy strategy;

    Ticket(int entrTime, Vehicle vehicle, Slot slot, TicketPricingStrategy strategy) {
        this.entryTime = entrTime;
        this.vehicle = vehicle;
        this.slot = slot;
        this.strategy = strategy;
    }

    int computeCost(int exitTime){
        return strategy.computeCost(this, exitTime);
    }
}


interface TicketPricingStrategy{
    int computeCost(Ticket ticket, int exitTime);
}

class LongDurationPricing implements TicketPricingStrategy{
    public int computeCost(Ticket ticket, int exitTime){
        return 100;
    }
}

class MinuteDurationPricing implements TicketPricingStrategy{
    public int computeCost(Ticket ticket, int exitTime){
        return 1000;
    }
}
