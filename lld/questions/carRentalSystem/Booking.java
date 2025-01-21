package Practice.lld.questions.carRentalSystem;

public class Booking {
    int id;
    Vehicele vehicle;
    String from;
    String to;
    int price;
    BookingStatus status;
    User user;

    public Booking(User user,Vehicele vehicle2, String from2, String to2, int price2, BookingStatus status2) {
       this.user = user;
        this.vehicle = vehicle2;
        this.from = from2;
        this.to=to2;
        this.price=price2;
        this.status = status2;
    }
}

enum BookingStatus{
    IN_PROGRESS,
    COMPLETED,
    CANCELLED,
}
