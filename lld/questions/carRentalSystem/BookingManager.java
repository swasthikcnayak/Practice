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
        Booking booking = new Booking(user, vehicle, from, to, price, BookingStatus.IN_PROGRESS);
        this.bookings.add(booking);
        Invoice invoice = new Invoice(null, booking.id, price);
        return invoice;
    }

    public void update(Invoice invoice) {
        Booking booking = this.bookings.get(invoice.bookingId);
        booking.status = BookingStatus.COMPLETED;
    }
}
