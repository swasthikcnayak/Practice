package Practice.lld.questions.carRentalSystem;

public class Payment {
    int amount;
    PaymentMode paymentMode;

    Payment(int amount, PaymentMode paymentMode) {
        this.amount = amount;
        this.paymentMode = paymentMode;
    }
}

enum PaymentMode{
    UPI,
    CARD,
    CASH,
}