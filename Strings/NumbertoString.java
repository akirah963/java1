public class NumbertoString {  

    public static void main(String[] args) {  
        int intValue = 123;  
        double doubleValue = 45.67;  
        float floatValue = 89.0f;  
        long longValue = 1234567890L;  
        boolean booleanValue = true;  

        
        String intString = String.valueOf(intValue);  
        System.out.println("int to String: " + intString);  

          
        String doubleString = String.valueOf(doubleValue);  
        System.out.println("double to String: " + doubleString);  

         
        String floatString = String.valueOf(floatValue);  
        System.out.println("float to String: " + floatString);  

         
        String longString = String.valueOf(longValue);  
        System.out.println("long to String: " + longString);  

        
        String booleanString = String.valueOf(booleanValue);  
        System.out.println("boolean to String: " + booleanString);  
    }  
}