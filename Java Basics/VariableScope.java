public class VariableScope {
    
   
    static int x = 100;

    public static void main(String[] args) {
        
        
        int x = 50;

        
        System.out.println("Local variable num: " + x);

        
        System.out.println("Global variable num: " + VariableScope.x);
    }
}
