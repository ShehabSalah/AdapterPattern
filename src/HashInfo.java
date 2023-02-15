import java.util.HashMap;
import java.util.List;

public interface HashInfo {

    void displayData();
    int getSize();

    void prepareData();
    List<HashMap<String, String>> getList();

    void setItem(HashMap<String, String> item);
}
