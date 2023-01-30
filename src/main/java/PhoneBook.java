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

    public String findByNumber(String number) {
        for (String key : phoneBookMap.keySet()) {
            if (phoneBookMap.get(key).equals(number)) {
                return key;
            }
        }
        return null;
    }

    public String findByName(String name) {
        for (String key : phoneBookMap.keySet()) {
            if (key.equals(name)) {
                return phoneBookMap.get(key);
            }
        }
        return null;
    }


}

