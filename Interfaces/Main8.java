
class OuterClass {
    private interface MyInterface {
        String NAME = "Private Interface Example";
        int VALUE = 42;
        void showMessage();
    }
    static class MyClass implements MyInterface {
        @Override
        public void showMessage() {
            System.out.println("Hello, this is the private interface method.");
        }
    }
    public static void printInterfaceValues() {
        System.out.println("Name: " + MyInterface.NAME);
        System.out.println("Value: " + MyInterface.VALUE);
    }
}
public class Main8 {
    public static void main(String[] args) {
        OuterClass.printInterfaceValues();
        OuterClass.MyClass obj = new OuterClass.MyClass();
        obj.showMessage();
    }
}