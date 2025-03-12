import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> studentSet = new HashSet<>();
        studentSet.add("John");
        studentSet.add("Jane");
        studentSet.add("Sam");
        studentSet.add("Lisa");
        studentSet.add("Mike");
        studentSet.add("Sara");
        studentSet.add("Tom");
        studentSet.add("Nina");
        studentSet.add("Peter");
        studentSet.add("Rachel");
        studentSet.add("John");
        System.out.println("HashSet: " + studentSet);
        boolean containsTom = studentSet.contains("Tom");
        System.out.println("Does the set contain 'Tom'? " + containsTom);
        System.out.println("Size of the HashSet: " + studentSet.size());
        boolean isEmpty = studentSet.isEmpty();
        System.out.println("Is the HashSet empty? " + isEmpty);
        studentSet.remove("Sara");
        System.out.println("HashSet after removing 'Sara': " + studentSet);
        System.out.println("Iterating through HashSet using Iterator:");
        Iterator<String> iterator = studentSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        studentSet.clear();
        System.out.println("HashSet after clearing all elements: " + studentSet);
        System.out.println("Is the HashSet empty after clearing? " + studentSet.isEmpty());
    }
}
