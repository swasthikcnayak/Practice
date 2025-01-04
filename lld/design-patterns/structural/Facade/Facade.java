/**
 * Facade pattern provides a simple interface for the complex subsystem
 * Client need not have to implement the complex logic of handleing of the objects within the subsystem.
 * 
 * FACADE VS PROXY VS ADAPTER
 * Facade : Facade pattern provides a simple interface for the complex subsystem. Provides single interface 
 *          for the functionality, thus any future changes needed only have to be made in the facade.
 *          Central access to all the logic & restrict direct access to the objects that are being used.
 *          There can be more than one facade implementing different functionalities, using the complex internal objects.
 * Proxy : Proxy pattern provides an interface to avoid the client directly accessing the real object
 * Adapter : Adapter pattern is used to make two interfaces compatible without changing the source code
 */


 class Facade {
    PaymentService payment;
    BookingService booking;

    // if we need to book Ticket from mulitiple places this logic has to be implemented everywhere to avoid it
    // we use a facade that will handle all the logics & internal complex objects.
    public void bookTicket(){
        if(booking.isValid()){
            booking.reserver();
            payment.complete();
            booking.book();
        }
    }
}
 