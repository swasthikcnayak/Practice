public abstract class Gate {
    TicketManager ticketManager;
    PaymentManager paymentManager;
}

class EntryGate extends Gate {
    Ticket entry(Vehicle vehicle, int entryTime, TicketPricingStrategy strategy){
        return ticketManager.createTicket(vehicle, entryTime, strategy);
    }
}

class ExitGate extends Gate {

    PaymentManager getPaymentManager(){
        return paymentManager;
    }

}

