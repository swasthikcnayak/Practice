import java.util.List;

public class IdleState implements State {
    StateMachine stateMachine;
    VendingMachine vendingMachine;

    @Override
    public void start() {
        stateMachine.setState(States.PRODUCT_SELECT);
    }

    @Override
    public boolean chooseItem(Product product, int quantity) {
        throw new UnsupportedOperationException("Unimplemented method 'chooseItem'");
    }

    @Override
    public void payAmount(int amount) {
        throw new UnsupportedOperationException("Unimplemented method 'payAmount'");
    }

    @Override
    public List<Product> dispenseProduct() {
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }

    @Override
    public int collectChange() {
        throw new UnsupportedOperationException("Unimplemented method 'collectChange'");
    }

    @Override
    public int collectRefund() {
        throw new UnsupportedOperationException("Unimplemented method 'collectRefund'");
    }
    
    
}
