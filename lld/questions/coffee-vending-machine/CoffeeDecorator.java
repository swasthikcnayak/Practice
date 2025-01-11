package Practice.lld.questions.coffee-vending-machine;

public abstract class CoffeeDecorator implements Coffee{
    Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee) {
        super(coffee);
    }

    public int getPrice(){
        return 20 + this.coffee.getPrice();
    }
}

class Sugar extends CoffeeDecorator {

    public Sugar(Coffee coffee) {    
        super(coffee);
    }

    public int getPrice(){
        return 10 + this.coffee.getPrice();
    }
}

class CoffeePowder extends CoffeeDecorator {

    public CoffeePowder(Coffee coffee) {    
        super(coffee);
    }

    public int getPrice(){
        return 10 + this.coffee.getPrice();
    }
}


class Cream extends CoffeeDecorator {

    public Cream(Coffee coffee) {    
        super(coffee);
    }

    public int getPrice(){
        return 40 + this.coffee.getPrice();
    }
}






