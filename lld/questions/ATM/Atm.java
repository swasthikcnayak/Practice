import java.util.List;

import javax.swing.plaf.nimbus.State;

public class ATM {
    AtmState AtmState;
    StateFactory stateFactory;
    CardDetails cardDetails;
    int amount;

    public ATM() {
        this.stateFactory = new StateFactory(this);
        this.AtmState = stateFactory.getState("InsertCard");
    }

    public void setState(String newState){
        this.AtmState = this.stateFactory.getState(newState);
    }

    public void insertCard(CardDetails details){
        this.AtmState.insertCard(details);
    }

    public void insertPin(int pin){
        return this.AtmState.insertPin();
    }

    public void withdraw(int amount){
        return this.AtmState.withdraw(amount);
    }

    public List<Integer, Integer> collectCash(){
        return this.AtmState.collectCardAndCash();
    }

    public void ejectCard(){
        return this.AtmState.ejectCard();
    }

    public void cancelTransaction(){
        this.AtmState.cancelTransaction();
    }

    public void setCarDetails(CardDetails details) {
        this.cardDetails = details;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void reset() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reset'");
    }

    public Object getCardDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCardDetails'");
    }
}
