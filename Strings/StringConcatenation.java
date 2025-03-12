public class StringConcatenation {  

    public static void main(String[] args) {  

        String str1 = "Hello";  
        String str2 = "World";  

         
        String result = str1 + " " + str2;    

        System.out.println(result);  
        int number = 123;  
        String combined = "The number is: " + number;  

        System.out.println(combined);  

          
        String moreCombined = str1 + " " + str2 + "! " + combined;  
        System.out.println(moreCombined); 
    }  
}  