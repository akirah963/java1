import java.util.Arrays;  

public class InsertElement {  

    public static int[] insertElement(int[] originalArray, int elementToInsert, int position) {  
        int originalLength = originalArray.length;  

 
        if (position < 0 || position > originalLength) {  
            System.out.println("Invalid position. Returning original array.");  
            return originalArray; 
        }  

        int[] newArray = new int[originalLength + 1]; 

        
        for (int i = 0; i < position; i++) {  
            newArray[i] = originalArray[i];  
        }  

    
        newArray[position] = elementToInsert;  


        for (int i = position; i < originalLength; i++) {  
            newArray[i + 1] = originalArray[i];  
        }  

        return newArray;  
    }  

    public static void main(String[] args) {  
        int[] originalArray = {1, 2, 3, 4, 5};  
        int elementToInsert = 10;  
        int position = 2; 

        int[] newArray = insertElement(originalArray, elementToInsert, position);  

        System.out.println("Original Array: " + Arrays.toString(originalArray));  
        System.out.println("New Array after insertion: " + Arrays.toString(newArray));  

    
        int[] invalidArray = insertElement(originalArray, 20, 10);  
        System.out.println("Array after invalid insertion attempt: " + Arrays.toString(invalidArray)); 
    }  
}  
