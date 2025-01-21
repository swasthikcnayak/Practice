package Practice.lld.questions.carRentalSystem;

public class Invoice {
    Payment payment;
    int bookingId;
    int amount;

    public Invoice(Payment payment, int bookingId, int amount) {
        this.payment = payment;
        this.bookingId = bookingId;
        this.amount = amount;
    }

    public void pay(Payment payment){
        this.payment = payment;
    }
}
