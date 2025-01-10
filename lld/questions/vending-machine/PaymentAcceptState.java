import java.util.List;

public class PaymentAcceptState implements State{
    StateMachine stateMachine;
    VendingMachine vendingMachine;
    PaymentManager paymentManager;

    @Override
    public void start() {
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    @Override
    public boolean chooseItem(Product product, int quantity) {
        throw new UnsupportedOperationException("Unimplemented method 'chooseItem'");
    }

    @Override
    public void payAmount(int amount) {
        this.paymentManager.pay(amount);
        this.stateMachine.setState(States.DISPENSE_ITEM);
    }

    @Override
    public List<Product> dispenseProduct() {
       throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }

    @Override
    public int collectChange() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'collectChange'");
    }

    @Override
    public int collectRefund() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'collectRefund'");
    }
    
}
