import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdapter implements EmployeeInterface {
    HashInfo hashInfo;

    public EmployeeAdapter(HashInfo hashInfo) {
        this.hashInfo = hashInfo;
        this.hashInfo.prepareData();
    }

    @Override
    public List<UserModel> getEmployeeList() {
        List<UserModel> users = new ArrayList<>();
        List<HashMap<String, String>> list = hashInfo.getList();

        for (HashMap<String,String> hashUser: list) {
            String[] username = hashUser.get("username").split(" ");
            String address = hashUser.get("street") + ", " + hashUser.get("country");

            UserModel user = new UserModel(
                    username[0],
                    username[1],
                    hashUser.get("email"),
                    address
            );

            users.add(user);
        }

        return users;
    }

    @Override
    public void printUserInfo() {
        this.hashInfo.displayData();
    }

    @Override
    public int getSize() {
        return hashInfo.getSize();
    }

    @Override
    public void addItem(UserModel item) {
        String[] address = item.getAddress().split(", ");

        HashMap<String, String> hashItem = new HashMap<>();
        hashItem.put("username", item.getfName() + " " + item.getlName());
        hashItem.put("email", item.getEmail());
        hashItem.put("country", address[1]);
        hashItem.put("street", address[0]);

        hashInfo.setItem(hashItem);
    }
}
