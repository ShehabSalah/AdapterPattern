import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapData implements HashInfo {

    List<HashMap<String, String>> hashes;

    public HashMapData() {}

    @Override
    public void prepareData() {
        List<HashMap<String, String>> users = new ArrayList<>();

        HashMap<String, String> moInfo = new HashMap<>();
        moInfo.put("username", "Mohamed Salah");
        moInfo.put("email", "mo@email.com");
        moInfo.put("country", "Egypt");
        moInfo.put("street", "Street1");

        users.add(moInfo);

        HashMap<String, String> erlingInfo = new HashMap<>();
        erlingInfo.put("username", "Erling Haaland");
        erlingInfo.put("email", "erling@email.com");
        erlingInfo.put("country", "Norwegian");
        erlingInfo.put("street", "Street1");

        users.add(erlingInfo);

        HashMap<String, String> harryInfo = new HashMap<>();
        harryInfo.put("username", "Harry Kane");
        harryInfo.put("email", "harry@email.com");
        harryInfo.put("country", "England");
        harryInfo.put("street", "Street1");

        users.add(harryInfo);

        this.hashes = users;
    }

    @Override
    public void displayData() {
        for (HashMap<String, String> item: this.hashes) {
            System.out.println("username: " + item.get("username"));
            System.out.println("email: " + item.get("email"));
            System.out.println("country: " + item.get("country"));
            System.out.println("street: " + item.get("street"));
            System.out.println("#############################");
        }
    }

    @Override
    public int getSize() {
        return this.hashes.size();
    }

    @Override
    public void setItem(HashMap<String, String> item) {
        this.hashes.add(item);
    }

    @Override
    public List<HashMap<String, String>> getList() {
        return this.hashes;
    }
}
