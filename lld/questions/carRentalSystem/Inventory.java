package Practice.lld.questions.carRentalSystem;

import java.util.List;

public class Inventory {
    List<Vehicele> vehicle;
    VehicleSearchStrategyFactory vehicleSearchStrategyFactory;

    public Inventory(List<Vehicele> vehicle) {
        this.vehicle = vehicle;
        this.vehicleSearchStrategyFactory = new VehicleSearchStrategyFactory();
    }

    public List<Vehicele> search(String strategy, String parameter) {
        VehicleSearchStrategy vehicleSearchStrategy = vehicleSearchStrategyFactory.getStrategy(strategy);
        return vehicleSearchStrategy.search(this.vehicle, parameter);
    }

    // CRUD
}
