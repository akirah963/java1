import java.lang.reflect.Field;

public class NoSuchFieldExceptionExample {

    public static void main(String[] args) {
        try {
            
            Class<?> clazz = ExampleClass.class;
            Field field = clazz.getDeclaredField("nonExistentField");  
        } catch (NoSuchFieldException e) {
            
            System.out.println("Error: No such field - " + e.getMessage());
        }
    }
}


class ExampleClass {
    private String name = "Java";
}
