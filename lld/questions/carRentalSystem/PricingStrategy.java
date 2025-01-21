package Practice.lld.questions.carRentalSystem;

public interface PricingStrategy {
    int calculatePrice(Vehicele booking, String from, String to);
}

class TypeBasedPricingStrategy implements PricingStrategy{
    @Override
    public int calculatePrice(Vehicele booking, String from, String to) {
        return 0;
    }
}
