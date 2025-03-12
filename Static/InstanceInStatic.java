public class InstanceInStatic {

    
    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    
    public static void staticMethod() {
        
        InstanceInStatic obj = new InstanceInStatic();
        
        
        obj.instanceMethod();
    }

   
    public static void main(String[] args) {
        
        staticMethod();
    }
}
