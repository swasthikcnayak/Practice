import java.util.List;

public class Withdraw implements AtmState {
    ATM atm;

    public Withdraw(ATM atm) {
    this.atm = atm;
    }
    
    public void insertCard(CardDetails details){
        throw new Exception("Invalid state");
    }
    public void insertPin(int pin, CardDetails details, PinValidator PinValidator){
        throw new Exception("Invalid state");
    }
    public void withdraw(int amount, AccountBalance validator){
        throw new Exception("Invalid state");
    }
    
    public List<Integer,Integer> collectCash(int amount, AmountDispensor dispensor){
        throw new Exception("Invalid state");
    }
    public void ejectCard(){
        System.out.println("Collect the card");
        this.atm.reset();
        this.atm.setState("collectCard");
    }
    public void cancelTransaction(){
        throw new Exception("Invalid state");
    }
}
