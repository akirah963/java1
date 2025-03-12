public class MethodOverloading2{

    
    public static void display(String message) {
        System.out.println("Message from first method: " + message);
    }

    
    public static void displayMessage(String message) {
        System.out.println("Message from second method: " + message);
    }

    public static void main(String[] args) {
        
        displayMessage("Hello, world!");
    }
}
