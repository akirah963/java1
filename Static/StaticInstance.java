public class StaticInstance {

    
    static int staticVar1 = 100;
    static int staticVar2 = 200;

   
    public void printStaticVariables() {
        
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
    }

   
    public static void main(String[] args) {
        
        StaticInstance obj = new StaticInstance();
        
       
        obj.printStaticVariables();
    }
}
