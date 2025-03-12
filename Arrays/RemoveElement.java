import java.util.Arrays;  

public class RemoveElement {  

    public static int[] removeElement(int[] arr, int elementToRemove) {  
        int count = 0; 
        for (int element : arr) {  
            if (element != elementToRemove) {  
                count++;  
            }  
        }  

        int[] newArray = new int[count];   
        int index = 0;  
        for (int element : arr) {  
            if (element != elementToRemove) {  
                newArray[index] = element;  
                index++;  
            }  
        }  
        return newArray;  
    }  

    public static void main(String[] args) {  
        int[] numbers = {1, 2, 3, 4, 2, 5, 2};  
        int elementToRemove = 2;  

        int[] newArray = removeElement(numbers, elementToRemove);  

        System.out.println("Original array: " + Arrays.toString(numbers));   
        System.out.println("Array with element " + elementToRemove + " removed: " + Arrays.toString(newArray)); 
    }  
}  