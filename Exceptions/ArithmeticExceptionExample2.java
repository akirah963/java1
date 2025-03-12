public class ArithmeticExceptionExample2 {

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            
            int result = numerator / denominator;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("Error: Cannot divide by zero.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
