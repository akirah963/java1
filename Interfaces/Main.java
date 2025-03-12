 
interface MyInterface {  
    void myMethod(String message); 
}  

class MyClass implements MyInterface {  
    @Override  
    public void myMethod(String message) {  
        System.out.println("The message is: " + message);  
    }  
}  
 
public class Main {  
    public static void main(String[] args) {  
        MyClass obj = new MyClass();  
        obj.myMethod("Hello, Interface!"); 
    }  
}  