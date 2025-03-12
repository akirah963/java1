import java.lang.reflect.Method;

public class NoSuchMethodExceptionExample {

    public static void main(String[] args) {
        try {
            
            Class<?> clazz = ExampleClass.class;
            Method method = clazz.getDeclaredMethod("nonExistentMethod"); 
        } catch (NoSuchMethodException e) {
           
            System.out.println("Error: No such method - " + e.getMessage());
        }
    }
}


class ExampleClass {
    public void displayMessage() {
        System.out.println("Hello, World!");
    }
}
