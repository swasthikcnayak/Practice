package Practice.lld.questions.HotelManagementSystem;

enum Authority{
    MANAGER, STAFF
}
public class Employee extends User{
    String employeeId;
    String designation;
    Authority Authority;
}
