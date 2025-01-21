package Practice.lld.questions.carRentalSystem;

import java.util.List;

public class VehicleSearchStrategyFactory {
    
    public VehicleSearchStrategy getStrategy(String strategy){
        if(strategy.equals("Model")){
            return new ModelSearchStrategy();
        }
        else if(strategy.equals("MfdDate")){
            return new MfdDateSearchStrategy();
        }
        return null;
    }
}

interface VehicleSearchStrategy {
    List<Vehicele> search(List<Vehicele> vehicle, String parameter);
}

class ModelSearchStrategy implements VehicleSearchStrategy{
    public List<Vehicele> search(List<Vehicele> vehicle, String model){
        return vehicle.stream().filter(v -> v.model.equals(model)).toList();
    }
}

class MfdDateSearchStrategy implements VehicleSearchStrategy{
    public List<Vehicele> search(List<Vehicele> vehicle, String mfd){
        return vehicle.stream().filter(v -> v.mfdDate.equals(mfd)).toList();
    }
}


