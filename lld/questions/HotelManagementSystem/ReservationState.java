package Practice.lld.questions.HotelManagementSystem;

public abstract class ReservationState {

    ReservationState next;
    float percentage;

    public abstract PaymentManager pay(Reservation reservation);

    public ReservationState getNextState() {
        return this.next;
    }
}

class ReservedState extends ReservationState{

    ReservedState(ReservationState nextSate, float percentage){
        this.next = nextSate;
        this.percentage = percentage;
    }

    public PaymentManager pay(Reservation reservation) {
        double dueAmount = reservation.due;
        dueAmount = percentage*dueAmount;
        return new PaymentManager(dueAmount, reservation);
    }
}
  


class CheckedInState extends ReservationState{
    CheckedInState(ReservationState nextSate, float percentage){
        this.next = nextSate;
        this.percentage = percentage;
    }


    @Override
    public PaymentManager pay(Reservation reservation) {
        double dueAmount = reservation.due;
        dueAmount = percentage*dueAmount;
        return new PaymentManager(dueAmount, reservation);
    }
}

class CheckOutState extends ReservationState{

    CheckOutState(ReservationState nextSate, float percentage){
        this.next = nextSate;
        this.percentage = percentage;
    }


    @Override
    public PaymentManager pay(Reservation reservation) {
        double dueAmount = reservation.due;
        dueAmount = percentage*dueAmount;
        return new PaymentManager(dueAmount, reservation);
    }
}