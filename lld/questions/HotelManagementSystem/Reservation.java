package Practice.lld.questions.HotelManagementSystem;

import java.util.List;

public class Reservation {
    int reservationId;
    Room room;
    Customer customer;
    int from;
    int to;
    int due;
    int totalCost;
    List<Invoice> invoices;
    ReservationState reservationState;

    Reservation(Room room, int from, int to, int cost, Customer customer, int reservationId) {
        this.reservationId = reservationId;
        this.room = room;
        this.from = from;
        this.to = to;
        this.due = cost;
        this.totalCost = cost;
        this.customer = customer;
        this.reservationState = new ReservedState(new CheckedInState(new CheckOutState(null, 1f), 0.3f) , 0.1f);
    }

    public PaymentManager pay(){
        PaymentManager paymentManager =  reservationState.pay(this);
        if(paymentManager.due == 0){
            this.setState(reservationState.getNextState());
            return null;
        }
        return paymentManager;
    }

    public void setState(ReservationState reservationState) {
        this.reservationState = reservationState;
    }

    public void paymentComplete(Invoice invoice) {
        this.due -= invoice.amount;
        this.invoices.add(invoice);
        this.setState(reservationState.getNextState());
    }
}
