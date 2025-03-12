import java.util.Arrays;  
import java.util.HashSet;  
import java.util.Set;  

public class DuplicateRemover {  

    public static int[] removeDuplicates(int[] arr) {  
        if (arr == null || arr.length == 0) {  
            return new int[0]; 
        }  

        
        Set<Integer> uniqueElements = new HashSet<>();  

        
        for (int num : arr) {  
            uniqueElements.add(num);  
        }  


        int[] result = new int[uniqueElements.size()];  
        int index = 0;  

        
        for (int num : uniqueElements) {  
            result[index++] = num;  
        }  

        return result;  
    }  

    public static void main(String[] args) {  
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};  
        int[] uniqueNumbers = removeDuplicates(numbers);  
        System.out.println("Original array: " + Arrays.toString(numbers));  
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueNumbers));  
        

        int[] emptyArray = {};  
        int[] uniqueEmpty = removeDuplicates(emptyArray);  
        System.out.println("Original array: " + Arrays.toString(emptyArray));  
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueEmpty));  
    

        int[] allSame = {3, 3, 3, 3};  
        int[] uniqueSame = removeDuplicates(allSame);  
        System.out.println("Original array: " + Arrays.toString(allSame));  
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueSame));   

        int[] nullArray = null;  
        int[] uniqueNull = removeDuplicates(nullArray);  
        System.out.println("Original array: null"); 
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueNull));  
        
    }  
}