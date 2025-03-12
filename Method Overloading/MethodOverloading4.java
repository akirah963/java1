public class MethodOverloading4 {

    
    public static int getMessage(int number) {
        return number * 2; 
    }

    
    public static String getMessage(String message) {
        return "Hello, " + message; 
    }

    public static void main(String[] args) {
        
        int result = getMessage(10);
        System.out.println("Integer result: " + result);

       
        String message = getMessage("World");
        System.out.println("String result: " + message);
    }
}
