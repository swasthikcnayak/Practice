package Practice.lld.questions.carRentalSystem;

import java.util.*;


public class BookingManager {
    List<Booking> bookings;
    PricingStrategy pricicingStrategy;

    BookingManager(List<Booking> bookings){
        this.bookings = bookings;
        pricicingStrategy  = new TypeBasedPricingStrategy();
    }

    public Invoice book(User user, Vehicele vehicle, String from, String to) {
        int price = pricicingStrategy.calculatePrice(vehicle, from, to);
        Booking booking = new Booking(user, vehicle, from, to, price, BookingStatus.PAYMENT_PENDING);
        this.bookings.add(booking);
        Invoice invoice = new Invoice(null, booking.id, price);
        return invoice;
    }
}
