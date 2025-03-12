import java.util.Arrays;    

public class CopyArray {  

    public static int[] copyArray(int[] sourceArray) {  
        int[] destinationArray = new int[sourceArray.length]; 
        for (int i = 0; i < sourceArray.length; i++) {  
            destinationArray[i] = sourceArray[i]; 
        }  
        return destinationArray;  
    }  

    public static void main(String[] args) {  
        int[] originalArray = {1, 2, 3, 4, 5};  
        int[] copiedArray = copyArray(originalArray);  

        System.out.println("Original Array: " + Arrays.toString(originalArray));  
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));   

        
        copiedArray[0] = 100;

        System.out.println("Original Array after modification: " + Arrays.toString(originalArray)); 
        System.out.println("Copied Array after modification: " + Arrays.toString(copiedArray));    
    }  
}  