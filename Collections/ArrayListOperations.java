import java.util.ArrayList;  
import java.util.Iterator;  

public class ArrayListOperations {  

    public static void main(String[] args) {  
        ArrayList<String> stringList = new ArrayList<>();  
        stringList.add("Apple");  
        stringList.add("Banana");  
        stringList.add("Orange");  
        stringList.add("Grapes");  
        stringList.add("Mango");  
        stringList.add("Strawberry");  
        stringList.add("Blueberry");  
        stringList.add("Kiwi");  
        stringList.add("Pineapple");  
        stringList.add("Watermelon");  

    
        stringList.add("Melon");  
        System.out.println("ArrayList after adding an element: " + stringList);  
        System.out.println("Iterating through ArrayList:");  
        Iterator<String> iterator = stringList.iterator();  
        while (iterator.hasNext()) {  
            System.out.println(iterator.next());  
        }  
        stringList.add(2, "Cherry");  
        System.out.println("ArrayList after adding 'Cherry' at index 2: " + stringList);  
        stringList.remove("Banana");  
        System.out.println("ArrayList after removing 'Banana': " + stringList);  
        stringList.remove(5);
        System.out.println("ArrayList after removing element at index 5: " + stringList);  
        stringList.set(3, "Green Apple");  
        System.out.println("ArrayList after updating element at index 3: " + stringList);  
        String elementAtIndex4 = stringList.get(4);  
        System.out.println("Element at index 4: " + elementAtIndex4);  
        int size = stringList.size();  
        System.out.println("Size of the ArrayList: " + size);   
        boolean containsKiwi = stringList.contains("Kiwi");  
        System.out.println("Does ArrayList contain 'Kiwi'? " + containsKiwi);   
        int indexToCheck = 2;  
        if (indexToCheck < stringList.size()) {  
            String elementAtIndex = stringList.get(indexToCheck);  
            System.out.println("Element at index " + indexToCheck + " is: " + elementAtIndex);  
        } else {  
            System.out.println("Index " + indexToCheck + " is out of bounds.");  
        }  
        stringList.clear();  
        System.out.println("ArrayList after removing all elements: " + stringList);  
        System.out.println("Is the ArrayList empty? " + stringList.isEmpty());  
    }  
}  