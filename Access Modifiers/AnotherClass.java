
class MyClass {
    
    int number = 10;
    String message = "Hello, world!";

    
    void displayMessage() {
        System.out.println(message);
    }

    
    void displayNumber() {
        System.out.println("Number: " + number);
    }
}

public class AnotherClass {
    public static void main(String[] args) {
        
        MyClass obj = new MyClass();

        
        System.out.println("Accessing default fields and methods from AnotherClass:");
        System.out.println("Number: " + obj.number); 
        obj.displayMessage(); 
        obj.displayNumber();   
    }
}
