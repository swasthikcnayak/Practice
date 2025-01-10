import java.util.List;

public class ProductSelectState implements State{
    StateMachine stateMachine;
    Inventory inventory;

    @Override
    public void start() {
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    @Override
    public boolean chooseItem(Product product, int quantity) {
        boolean result = this.inventory.chooseItem(product, quantity);
        if(result){
            stateMachine.setState(States.PAYMENT_ACCEPT);
            return true;
        }
        return false;
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
