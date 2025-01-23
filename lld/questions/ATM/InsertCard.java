public class InsertCard implements AtmState {
    ATM atm;

    public InsertCard(ATM atm) {
    this.atm = atm;
    }
    
    public void insertCard(CardDetails details){
        this.atm.setCarDetails(details);
        this.atm.setState("EnterPin");
    }
    public void insertPin(int pin){
        throw new Exception("Invalid state");
    }
    public void withdraw(int amount){
        throw new Exception("Invalid state");
    }
    public void collectCash(){
        throw new Exception("Invalid state");
    }
    public void ejectCard(){
        throw new Exception("Invalid state");
    }
    public void cancelTransaction(){
        throw new Exception("Invalid state");
    }
}
