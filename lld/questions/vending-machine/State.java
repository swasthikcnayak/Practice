import java.util.List;

interface State{
    void start();
    boolean chooseItem(Product product, int quantity);
    void payAmount(int amount);
    List<Product> dispenseProduct();
    int collectChange();
    int collectRefund();
}

enum States{
    READY,
    PRODUCT_SELECT,
    PAYMENT_ACCEPT,
    DISPENSE_ITEM,
    CANCEL,
}