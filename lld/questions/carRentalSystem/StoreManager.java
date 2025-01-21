package Practice.lld.questions.carRentalSystem;

import java.util.List;

;

public class StoreManager {
    List<Store> stores;
    StoreSearchStrategyFactory searchStrategyFactory;

    public StoreManager(List<Store> stores) {
        this.stores = stores;
        this.searchStrategyFactory = new StoreSearchStrategyFactory();
    }

    public List<Store> findStores(String strategy, String query) {
        StoreSearchStrategy storeSearchStrategy = searchStrategyFactory.getStrategy(strategy);
        return storeSearchStrategy.search(stores, query);
    }
}
