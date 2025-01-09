import java.util.Map;

public class Product {
    int id;
    String productName;
    int price;
}

class Inventory {
    Map<Product, Integer> productMap;

    public Inventory(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }

    Product dispenseProduct(int productId, int quantity) {
        return new Product();
    }

    void fillProduct(Product product, int quantity) {
        productMap.put(product, productMap.getOrDefault(product, 0) + quantity);
    }
}