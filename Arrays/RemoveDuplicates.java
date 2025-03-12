import java.util.Arrays;  

public class RemoveDuplicates {  

    public static int[] removeDuplicates(int[] arr) {  
        if (arr == null || arr.length == 0) {  
            return arr; 
        }  

        Arrays.sort(arr); 

        int uniqueIndex = 0; 
        for (int i = 1; i < arr.length; i++) {  
            if (arr[i] != arr[uniqueIndex]) {  
                uniqueIndex++;  
                arr[uniqueIndex] = arr[i];
            }  
        }  

    
        return Arrays.copyOfRange(arr, 0, uniqueIndex + 1);  
    }  

    public static void main(String[] args) {  
        int[] numbers = {1, 2, 2, 3, 4, 4, 4, 5};  
        int[] uniqueNumbers = removeDuplicates(numbers);  

        System.out.println("Original array: " + Arrays.toString(numbers));  
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueNumbers));  
    }  
}
