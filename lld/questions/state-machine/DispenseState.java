import java.util.List;

class DispenseState implements State {
    StateMachine stateMachine;
    VendingMachine vendingMachine;
    Inventory inventory;

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
        throw new UnsupportedOperationException("Unimplemented method 'payAmount'");
    }

    @Override
    public List<Product> dispenseProduct() {
        this.inventory.dispense();
        this.inventory.returnChange();
        return Product & change
        this.stateMachine.setState(States.READY)
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