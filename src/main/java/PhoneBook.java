import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> phoneBookMap = new HashMap<>();

    public boolean add(String name, String number) {
        if (name == null || number == null || phoneBookMap.containsKey(name)) {
            return false;
        }
        phoneBookMap.put(name, number);
        return true;
    }


}

