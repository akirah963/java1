public class InstanceStatic {

    
    int instanceVar1 = 10;
    int instanceVar2 = 20;

    
    public static void printInstanceVariables() {
        
        InstanceStatic obj = new InstanceStatic();
        
        
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }

   
    public static void main(String[] args) {
       
        printInstanceVariables();
    }
}
