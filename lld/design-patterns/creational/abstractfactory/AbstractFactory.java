/**
 * 
 * Referred to as factory of factory.
 * Used when the objects that are to be created can be grouped together withotu
 * specifying their exact classes.
 * 
 * here I've different companies: BME, Ferrari, Tata, Toyota
 * these companies can be group : BMW & Ferrari as luxugy companies
 * Tata & toyota as normal comapnies.
 * Will group them together.
 * 
 */

interface Company {
    String getCompany();
}

class BMW implements Company {
    public String getCompany() {
        return "BMW";
    }
}

class Ferrari implements Company {
    public String getCompany() {
        return "FerrariL";
    }
}

class Tata implements Company {
    public String getCompany() {
        return "Tata";
    }
}

class Toyota implements Company {
    public String getCompany() {
        return "Toyota";
    }
}

interface AbstractFactory{
    Company getCompany(String type);
}

class PremiumFactory implements AbstractFactory{
    public Company getCompany(String type){
        if(type == "BMW"){
            return new BMW();
        }else if(type == "Ferrari"){
            return new Ferrari();
        }
        return null;
    }
}

class NormalFactory implements AbstractFactory{
    public Company getCompany(String type){
        if(type == "Tata"){
            return new Tata();
        }else if(type == "Toyota"){
            return new Toyota();
        }
        return null;
    }
}

 class AbstractFactoryProvider {

    AbstractFactory getInstance(String type){
        if(type == "PREMIUm"){
            return new PremiumFactory();
        }else if(type == "NORMAL"){
            return new NormalFactory();
        }
        return null;
    }
}

class Main{
    public static void main(String[] args){
        // I need a BMW company
        AbstractFactory factory = new AbstractFactoryProvider().getInstance("PREMIUM");
        Company company = factory.getCompany("BMW");
        System.out.println("Company : " + company.getCompany());
    
        // If there was no grouping, no factoyr provider is needed
    }
}