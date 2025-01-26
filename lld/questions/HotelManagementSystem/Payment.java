package Practice.lld.questions.HotelManagementSystem;

public class Payment {
    int amount;
    PaymentMode paymentMode;
}

enum PaymentMode{
    UPI,
    CARD,
    CASH,
}
