public class StateFactory {
    ATM atm;

    public StateFactory(ATM atm){
        this.atm = atm;
    }
    public AtmState getState(String stateName) {
        switch (stateName) {
            case "InsertCard":
                return new InsertCard(atm);
            case "EnterPin":
                return new EnterPin();
            case "Withdraw":
                return new Withdraw();
            case "CollectCash":
                return new CollectCash();
            case "CollectCard":
                return new EjectCard();
            case "CancelTransaction":
                return new CancelTransaction();
            default:
                return null;
        }
    }
}
