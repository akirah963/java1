
class MyCustomException extends Exception {
    
    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample1 {

    
    public static void checkAge(int age) throws MyCustomException {
        if (age < 18) {
            
            throw new MyCustomException("Error: Age must be 18 or older.");
        } else {
            System.out.println("You are eligible, age is: " + age);
        }
    }

    public static void main(String[] args) {
        try {
           
            checkAge(15);
        } catch (MyCustomException e) {
           
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
