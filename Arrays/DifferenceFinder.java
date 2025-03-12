public class DifferenceFinder {  

    public static int findDifference(int[] arr) {  
        if (arr == null || arr.length == 0) {  
            return 0; 
        }  

        int smallest = arr[0];  
        int largest = arr[0];  

        for (int num : arr) {  
            if (num < smallest) {  
                smallest = num;  
            }  
            if (num > largest) {  
                largest = num;  
            }  
        }  

        return largest - smallest;  
    }  

    public static void main(String[] args) {  
        int[] numbers = {1, 5, 2, 8, 3, 9, 4};  
        int difference = findDifference(numbers);  
        System.out.println("Difference between largest and smallest: " + difference); 

        int[] sameNumbers = {5, 5, 5, 5};  
        difference = findDifference(sameNumbers);  
        System.out.println("Difference between largest and smallest: " + difference); 

        int[] oneNumber = {7};  
        difference = findDifference(oneNumber);  
        System.out.println("Difference between largest and smallest: " + difference); 

        int[] emptyArray = {};  
        difference = findDifference(emptyArray);  
        System.out.println("Difference between largest and smallest: " + difference);
    }  
}
