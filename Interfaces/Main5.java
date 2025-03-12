interface MyInterface {
    
    default void showMessage() {
        System.out.println("This is the default method.");
    }
}


class MyClass implements MyInterface{

}

public class Main5 {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); 
        obj.showMessage(); 
    }
}