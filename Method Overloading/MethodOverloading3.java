public class MethodOverloading3 {

   
    public static void displayMessage(int number) {
        System.out.println("Message from method with integer: " + number);
    }

   
    public static void displayMessage(String message) {
        System.out.println("Message from method with string: " + message);
    }

    public static void main(String[] args) {
        
        displayMessage(10);

        
        displayMessage("Hello, Java!");
    }
}
