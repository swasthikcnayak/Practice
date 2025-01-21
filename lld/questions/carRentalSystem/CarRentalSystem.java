package Practice.lld.questions.carRentalSystem;

import java.util.List;

public class CarRentalSystem {
    StoreManager storeManager;


    public CarRentalSystem(StoreManager storeManager) {
        this.storeManager  = storeManager;
    }

    public List<Store> findStores(String strategy, String query) {
        return storeManager.findStores(strategy, query);
    }
}
