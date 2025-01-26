package Practice.lld.questions.HotelManagementSystem;

public class Invoice {
    double amount;
    ModeOfPayment modeOfPayment;
    Reservation reservation;

    Invoice(double amount, ModeOfPayment mode, Reservation reservation){
        this.modeOfPayment = mode;
        this.amount = amount;
        this.reservation = reservation;
    }
}
