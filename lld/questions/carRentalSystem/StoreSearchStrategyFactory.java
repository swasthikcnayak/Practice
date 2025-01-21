package Practice.lld.questions.carRentalSystem;

import java.util.List;

public class StoreSearchStrategyFactory {
    
    public StoreSearchStrategy getStrategy(String strategy){
        if(strategy.equals("Pincode")){
            return new PincodeSearchStrategy();
        }
        else if(strategy.equals("City")){
            return new CitySearchStrategy();
        }
        return null;
    }
}

interface StoreSearchStrategy {
    List<Store> search(List<Store> stores, String parameter);
}

class PincodeSearchStrategy implements StoreSearchStrategy{
    public List<Store> search(List<Store> stores, String pincode){
        return stores.stream().filter(store -> store.pinCode.equals(pincode)).toList();
    }
}

class CitySearchStrategy implements StoreSearchStrategy{
    public List<Store> search(List<Store> stores, String city){
        return stores.stream().filter(store -> store.city.equals(city)).toList();
    }
}


