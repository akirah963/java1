interface MyInterface {
    
    String NAME = "Interface Example";
    int VALUE = 42;
    void showMessage();
}
class MyClass implements MyInterface {
    @Override
    public void showMessage() {
        System.out.println("Hello, this is the interface method.");
    }
}
public class Main7 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("Name: " + MyInterface.NAME);
        System.out.println("Value: " + MyInterface.VALUE);
        obj.showMessage();
    }
}