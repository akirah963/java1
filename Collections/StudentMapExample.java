import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMapExample {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "John Doe");
        studentMap.put(102, "Jane Smith");
        studentMap.put(103, "Sam Brown");
        studentMap.put(104, "Lisa White");
        studentMap.put(105, "Mike Green");
        studentMap.put(106, "Sara Black");
        studentMap.put(107, "Tom Blue");
        studentMap.put(108, "Nina Red");
        studentMap.put(109, "Peter Grey");
        studentMap.put(110, "Rachel Yellow");
        studentMap.put(111, "Alex Purple");
        String name = studentMap.get(105);
        System.out.println("Student with ID 105: " + name);
        Map<Integer, String> copiedMap = new HashMap<>(studentMap);
        System.out.println("Copied Map: " + copiedMap);
        boolean hasKey = studentMap.containsKey(101);
        System.out.println("Map contains ID 101: " + hasKey);
        boolean hasValue = studentMap.containsValue("Sara Black");
        System.out.println("Map contains 'Sara Black': " + hasValue);
        boolean isEmpty = studentMap.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);
        System.out.println("Size of the map: " + studentMap.size());
        System.out.println("All student IDs (Keys): ");
        Set<Integer> keys = studentMap.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }
        System.out.println("All student names (Values): ");
        for (String value : studentMap.values()) {
            System.out.println(value);
        }
        studentMap.remove(110);
        System.out.println("Map after removing student ID 110: " + studentMap);
        Map<Integer, String> anotherMap = new HashMap<>();
        anotherMap.putAll(studentMap);
        System.out.println("Another Map with copied elements: " + anotherMap);
    }
}
