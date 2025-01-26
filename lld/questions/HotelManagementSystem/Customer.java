package Practice.lld.questions.HotelManagementSystem;

enum IdentificationType{
    AADHAAR, PASSPORT, PAN_CARD
}
public class Customer extends User {
    String address;
    IdentificationType idType;
    String idNumber;
}
