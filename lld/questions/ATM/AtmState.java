import java.util.List;

public interface AtmState {
    public void insertCard(CardDetails details) ;
    public void insertPin(int pin, PinValidator pinValidator) ;
    public void withdraw(int amount, AccountBalanceValidator balanceValidator) ;
    public List<Integer,Integer> collectCash(AmountDispensor dispensor) ;
    public void ejectCard() ;
    public void cancelTransaction() ;
}
