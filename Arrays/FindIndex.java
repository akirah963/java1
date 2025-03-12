public class FindIndex {  

    public static int findIndexOf(int[] arr, int target) {  
        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] == target) {  
                return i; 
            }  
        }  
        return -1; 
    }  

    public static void main(String[] args) {  
        int[] numbers = {10, 20, 30, 40, 50};  
        int targetValue = 30;  

        int index = findIndexOf(numbers, targetValue);  

        if (index != -1) {  
            System.out.println("Element " + targetValue + " found at index: " + index);  
        } else {  
            System.out.println("Element " + targetValue + " not found in the array.");  
        }  
    }  
}  