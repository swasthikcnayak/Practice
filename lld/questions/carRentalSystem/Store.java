package Practice.lld.questions.carRentalSystem;

import java.util.List;

public class Store {
    Inventory inventory;
    BookingManager bookingManager;
    String city;
    String addresss;
    String pinCode;

    public Store(Inventory inventory){
        this.inventory = inventory;
    }

    public List<Vehicele> searchVehicle(String strategy, String parameter){
        return inventory.search(strategy, parameter);
    }

    public Invoice bookVehicle(User user,Vehicele vehicele, String from, String to){
       return bookingManager.book(user, vehicele, from, to);
    }

    public void payInvoice(Payment payment, Invoice invoice){
        invoice.pay(payment);
        bookingManager.update(invoice);
    }

    public void completeBooking(int bookingId){
        // mark the booking as complete
    }

}
