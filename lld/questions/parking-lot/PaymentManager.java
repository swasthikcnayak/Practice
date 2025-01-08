public class PaymentManager {
    PaymentGateway paymentGateway;

    public PaymentManager(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    void setPaymentGateway(PaymentGateway paymentGateway) { 
        this.paymentGateway = paymentGateway;
    }

    void pay(Ticket ticket, int exitTime){
        int cost = ticket.computeCost(exitTime);
        this.paymentGateway.pay(cost);
    }
}

interface PaymentGateway{
    void pay(int amount);
}

class UPIInterface implements PaymentGateway{
    public void pay(int amount){
        System.out.print("Payed via upi");
    }
}


class CardInterface implements PaymentGateway{
    public void pay(int amount){
        System.out.print("Payed via upi");
    }
}
