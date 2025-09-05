package collectionsconcept;

import java.util.HashMap;
import java.util.Map;

class HashMapConcept {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

// 1. Using for-each on entrySet
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " => " + entry.getValue());
}

// 2. Using keySet
for (Integer key : map.keySet()) {
    System.out.println(key + " => " + map.get(key));
}

// 3. Using forEach (Java 8+)
map.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}
