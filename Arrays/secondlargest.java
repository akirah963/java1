public class secondlargest {  

    public static int findSecondLargest(int[] arr) {  
        if (arr == null || arr.length < 2) {  
            throw new IllegalArgumentException("Array must have at least two elements.");  
        }  

        int largest = Integer.MIN_VALUE;  
        int secondLargest = Integer.MIN_VALUE;  

        for (int num : arr) {  
            if (num > largest) {  
                secondLargest = largest;  
                largest = num;  
            } else if (num > secondLargest && num != largest) {  
                secondLargest = num;  
            }  
        }  

        if (secondLargest == Integer.MIN_VALUE) {  
            
            throw new IllegalArgumentException("No second largest element exists.");  
        }  

        return secondLargest;  
    }  

    public static void main(String[] args) {  
        int[] numbers = {1, 5, 2, 8, 3, 9, 4};  
        int secondLargest = findSecondLargest(numbers);  
        System.out.println("Second largest number: " + secondLargest);

        int[] sameNumbers = {5, 5, 5, 5};  
        try {  
            secondLargest = findSecondLargest(sameNumbers);  
            System.out.println("Second largest number: " + secondLargest);  
        } catch (IllegalArgumentException e) {  
            System.out.println("Error: " + e.getMessage()); 
        }  
    }  
}