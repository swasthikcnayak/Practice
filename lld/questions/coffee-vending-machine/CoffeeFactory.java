package Practice.lld.questions.coffee-vending-machine;

enum CoffeeEntity{
    LATTE,
    Cappuccino,
    Espresso,
    SUGAR,
    MILK,
    COFFEE_POWEDR,
    CREAM
}
public class CoffeeFactory {
    
    public Coffee getCoffe(CoffeeEntity coffyEntity){
        if(coffyEntity == CoffeeEntity.LATTE){
            return new Lattee();
        else if (coffyEntity == CoffeeEntity.Cappuccino)
            return new Cappuccino();
        else if (coffyEntity == CoffeeEntity.Espresso)
            return new Espresso();
        else if (coffyEntity == CoffeeEntity.SUGAR)
            return new Sugar();
        else if (coffyEntity == CoffeeEntity.MILK)
            return new Milk();
        else if (coffyEntity == CoffeeEntity.COFFEE_POWEDR)
            return new CoffeePowder();
        else if (coffyEntity == CoffeeEntity.CREAM)
            return new Cream();
        return null;
    }
}
