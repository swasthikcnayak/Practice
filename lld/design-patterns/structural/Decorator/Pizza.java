/**
 * This is the implementation of the decorator design pattern
 * it is used when we want to add additional functionality to the object at run time without 
 * alterning the classes itself and using composition
 */

interface Pizza {
    public String getDescription();

    public int getcost();
}

class CheapBasePizza implements Pizza {
    public String getDescription() {
        return "Base Pizza";
    }

    public int getcost() {
        return 100;
    }
}

class CostlyBasePizza implements Pizza {
    public String getDescription() {
        return "Base Pizza";
    }

    public int getcost() {
        return 100;
    }
}

abstract class DecoratedPizza implements Pizza {
    Pizza pizza;

    DecoratedPizza(Pizza pizza) {
        this.pizza = pizza;
    }
}

class CheeseDecorator extends DecoratedPizza {
    CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    public int getcost() {
        return 20 + this.pizza.getcost();
    }

    public String getDescription() {
        return "Cheese + " + this.pizza.getDescription();
    }
}

class PepporoniDecorator extends DecoratedPizza {

    PepporoniDecorator(Pizza pizza) {
        super(pizza);
    }

    public int getcost() {
        return 30 + this.pizza.getcost();
    }

    public String getDescription() {
        return "Pepporoni + " + this.pizza.getDescription();
    }
}

class Main {
    public static void main(String[] args) {
        Pizza pizza = new PepporoniDecorator(new CheapBasePizza());
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getcost());
    }
}