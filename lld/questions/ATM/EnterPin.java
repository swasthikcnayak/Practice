public class EnterPin implements AtmState {
    ATM atm;

    public EnterPin(ATM atm) {
    this.atm = atm;
    }
    
    public void insertCard(CardDetails details){
        throw new Exception("Invalid state");
    }
    public void insertPin(int pin, CardDetails details, PinValidator PinValidator){
        boolean status = PinValidator.validate(details, pin);
        if(true){
             atm.setState("withdraw");
             return ;
        }
        throw new Exception("Invalid pin");
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
