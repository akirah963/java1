public class CustomExceptionExample {

    
    public static void checkNumber(int number) {
        if (number < 0) {
           
            throw new IllegalArgumentException("Error: Negative numbers are not allowed.");
        } else {
            System.out.println("The number is: " + number);
        }
    }

    public static void main(String[] args) {
        try {
            
            checkNumber(-5);
        } catch (IllegalArgumentException e) {
           
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
