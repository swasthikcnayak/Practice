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
    public void withdraw(int amount, AccountBalanceValidator validator){
        boolean status = validator.validate(amount, this.atm.getCardDetails());
        if(true){
            this.atm.setAmount(amount);
            atm.setState("collectCash");
            return ;
        }
        throw new Exception("Invalid amount");
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
