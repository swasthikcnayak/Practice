package Practice.lld.questions.coffee-vending-machine;

public class CofeeMachine {
    
    CoffeeFactory coffeeFactory;

    public CofeeMachine(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    // neeed to use state : state 1 : choose base coffee first,
    // then choose the decorator.
    // after choosing decorator can choose other decorator or go for buy
    // buy() function called, return the amount, then handle the money
    public Coffee baseCoffee(CoffeeEntity coffyEntity){
        return coffeeFactory.getCoffe(coffyEntity);
    }
    public Coffee getCoffe(CoffeeEntity coffyEntity){
        return coffeeFactory.getCoffe(coffyEntity);
    }
}
