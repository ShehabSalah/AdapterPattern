import java.util.List;

public interface EmployeeInterface {

    List<UserModel> getEmployeeList();
    void printUserInfo();
    int getSize();

    void addItem(UserModel item);
}
