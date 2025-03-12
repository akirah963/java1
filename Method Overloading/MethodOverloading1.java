public class MethodOverloading1{

    
    public static void displayMessage(int number) {
        System.out.println("Message with integer: " + number);
    }

    
    public static void displayMessage(String message, int number) {
        System.out.println("Message with string and integer: " + message + " " + number);
    }

    public static void main(String[] args) {
        
        displayMessage(10);


        displayMessage("The number is", 20);
    }
}
