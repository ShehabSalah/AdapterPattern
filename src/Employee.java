import java.util.List;

public class Employee implements EmployeeInterface {

    List<UserModel> users;

    public Employee() {
    }

    public Employee(List<UserModel> users) {
        this.users = users;
    }

    @Override
    public List<UserModel> getEmployeeList() {
        return this.users;
    }

    @Override
    public void printUserInfo() {
        for(UserModel user: users) {
            System.out.println("First Name: " + user.getfName());
            System.out.println("Last Name: " + user.getlName());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Address: " + user.getAddress());
            System.out.println("-----------------------------");
        }
    }

    @Override
    public int getSize() {
        return this.users.size();
    }

    public void setUsers(List<UserModel> users) {
        this.users = users;
    }

    public void addItem(UserModel user) {
        users.add(user);
    }
}
