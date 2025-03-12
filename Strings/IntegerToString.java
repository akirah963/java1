public class IntegerToString{  

    public static void main(String[] args) {  
          
        Integer integerObject = Integer.valueOf(42); 

         
        String stringValue1 = integerObject.toString();  
        System.out.println("Using toString(): " + stringValue1);  

          
        String stringValue2 = String.valueOf(integerObject);  
        System.out.println("Using String.valueOf(): " + stringValue2);  

        
        String stringValue3 = String.format("%d", integerObject);  
        System.out.println("Using String.format(): " + stringValue3);  
    }  
}