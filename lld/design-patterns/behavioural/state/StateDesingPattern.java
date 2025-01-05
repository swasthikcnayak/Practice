/**
 * State design pattern is used when we want to have limited functioanlity in every state,
 * and moving from one state to other when certain operation occurs.
 * Popularly implemented with state machine.
 */

/*
 * 
 * Popular is vending machine & ATM
 * 
 * The following is the implementation of the ATM, here only implemented for the AcceptCard state.
 */

 interface AtmState {
    public void acceptCard();
    public void acceptAmount();
    public void dispenseMoney(); 
 }
 class Atm implements AtmState {
    AtmState state;
    public void setState(AtmState state){
        this.state = state;
    }   

    public void acceptCard(){
        state.acceptCard(); // if the current state is not the AcceptCard state will throw exception
    }

   @Override
   public void acceptAmount() {
      state.acceptAmount();
   }

   @Override
   public void dispenseMoney() {
     state.dispenseMoney();
   }
 }


class AcceptCard implements AtmState{

   Atm atm;

    public AcceptCard(Atm atm) {
        this.atm = atm;
    }

    public void acceptCard(){
        System.out.println("Card Accepted");
        atm.state =  new AcceptAmount(atm);
    }

   @Override
   public void acceptAmount() {
      throw new UnsupportedOperationException("Unimplemented method 'acceptAmount'");
   }

   @Override
   public void dispenseMoney() {
      throw new UnsupportedOperationException("Unimplemented method 'dispenseMoney'");
   }    
} 


class AcceptAmount implements AtmState{

   Atm atm;

    public AcceptAmount(Atm atm) {
        this.atm = atm;
    }

    public void acceptCard(){
      throw new UnsupportedOperationException("Unimplemented method 'dispenseMoney'");
    }

   @Override
   public void acceptAmount() {
      System.out.println("Card Accepted");
   }

   @Override
   public void dispenseMoney() {
      throw new UnsupportedOperationException("Unimplemented method 'dispenseMoney'");
   }    
} 
