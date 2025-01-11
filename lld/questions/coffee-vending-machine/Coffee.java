package Practice.lld.questions.coffee-vending-machine;

public interface Coffee{
    public int getPrice();
}

class Espresso implements Coffee{
    @Override
    public int getPrice() {
        return 100;
    }
}


class Lattee implements Coffee {
    
    @Override
    public int getPrice() {
        return 150;
    }
}

class Cappuccino implements Coffee {
    
    @Override
    public int getPrice() {
        return 200;
    }
}