public class MethodOverloading {
    public static void displayMessage(String message) {
        System.out.println("Message with one parameter: " + message);
    }

    
    public static void displayMessage(String message, String additionalMessage) {
        System.out.println("Message with two parameters: " + message + " " + additionalMessage);
    }

    public static void main(String[] args) {
        
        displayMessage("Hello, world!");

        
        displayMessage("Hello", "Java!");
    }
}
