public class SampleClass {
    
    
    static int staticVar1 = 10;
    static int staticVar2 = 20;
    
   
    int instanceVar1 = 30;
    int instanceVar2 = 40;
    
    
    public static void staticMethod1() {
        System.out.println("Static Method 1");
        System.out.println("Static Variable 1: " + staticVar1);
    }

    public static void staticMethod2() {
        System.out.println("Static Method 2");
        System.out.println("Static Variable 2: " + staticVar2);
    }

    
    public void instanceMethod1() {
        System.out.println("Instance Method 1");
        System.out.println("Instance Variable 1: " + instanceVar1);
    }

    public void instanceMethod2() {
        System.out.println("Instance Method 2");
        System.out.println("Instance Variable 2: " + instanceVar2);
    }

    
    public static void main(String[] args) {
        
        staticMethod1();
        staticMethod2();
        
        
        SampleClass obj = new SampleClass();
        
       
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}
