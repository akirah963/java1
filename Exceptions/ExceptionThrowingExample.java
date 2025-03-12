public class ExceptionThrowingExample {

    
    public static void throwException() throws ArithmeticException {
        int numerator = 10;
        int denominator = 0;
        
        
        int result = numerator / denominator;
        
        System.out.println("The result is: " + result);
    }

    public static void main(String[] args) {
        
        throwException();
        
        
        System.out.println("This will not be printed if exception occurs.");
    }
}
