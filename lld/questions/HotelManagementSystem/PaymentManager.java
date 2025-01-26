package Practice.lld.questions.HotelManagementSystem;

public class PaymentManager {
    double due;
    Reservation reservation;

    PaymentManager(double due, Reservation reservation) {
        this.due = due;
        this.reservation = reservation;    
    }
    

    public Invoice pay(double amount, ModeOfPayment paymentMode) {
        Invoice invoice = new Invoice(amount, paymentMode, reservation);
        this.reservation.paymentComplete(invoice);
        return invoice;
    }
}
