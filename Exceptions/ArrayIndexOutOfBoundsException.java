public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        int[] numbers = new int[5]; 

        
        numbers[10] = 100; 

        System.out.println("Array value at index 10: " + numbers[10]);
    }
}
