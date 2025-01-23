import java.util.HashMap;

public class AmountDispensor {
    AmountHandler chain;
    public List<Integer,Integer> dispense(int amount){
        Map<Integer,Integer> ans = new HashMap<>();
        this.chain.dispense(amount, ans);
        return ans;
    };
}

public abstract class AmountHandler {
    AmountHandler chain;

    AmountHandler(AmountHandler amountHandler){
        this.chain = amountHandler;
    }

    public void dispense(int amount,  Map<Integer,Integer> map){
        return chain.dispense(amount, map);
    } // has to be changed to map
}

public class TwoThousanHandler extends AmountHandler {
    public TwoThousanHandler(AmountHandler chain) {
        super(chain);
    }

    public void dispense(int amount, Map<Integer,Integer> map){
       int count = amount/2000;
       if(count>0){
           map.put(2000, count);
       }
       return super(amount%2000, map);
    };
}

// similarly for other denominations