public class EvenOddCounter {  

    public static void countEvenOdd(int[] arr) {  
        int evenCount = 0;  
        int oddCount = 0;  

        for (int num : arr) {  
            if (num % 2 == 0) {  
                evenCount++;  
            } else {  
                oddCount++;  
            }  
        }  

        System.out.println("Even numbers: " + evenCount);  
        System.out.println("Odd numbers: " + oddCount);  
    }  

    public static void main(String[] args) {  
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
        countEvenOdd(numbers);  

        int[] emptyArray = {};  
        countEvenOdd(emptyArray); 

        int[] allEven = {2, 4, 6, 8};  
        countEvenOdd(allEven);  

        int[] allOdd = {1, 3, 5, 7};  
        countEvenOdd(allOdd); 
    }  
}
