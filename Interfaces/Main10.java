
interface MyInterface {
    static final String GREETING = "Hello from the Interface!";
}
class MyClass implements MyInterface {
    public void showMessage() {
        System.out.println(GREETING);
    }
}
public class Main10 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showMessage();
    }
}