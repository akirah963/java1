public class StringMatches {  

    public static void main(String[] args) {  
        String str1 = "12345";  
        String str2 = "abcde";  
        String str3 = "123ab";  
        String str4 = "1234567";  

        
        String regex1 = "\\d+";  
         String regex2 = "\\d{5}";   
        boolean matches1 = str1.matches(regex1);  
        System.out.println(str1 + " matches " + regex1 + ": " + matches1); 
        boolean matches2 = str2.matches(regex1);  
        System.out.println(str2 + " matches " + regex1 + ": " + matches2); 

          
        boolean matches3 = str3.matches(regex1);  
        System.out.println(str3 + " matches " + regex1 + ": " + matches3); 

         
        boolean matches4 = str1.matches(regex2);  
        System.out.println(str1 + " matches " + regex2 + ": " + matches4);   

        
        boolean matches5 = str4.matches(regex2);  
        System.out.println(str4 + " matches " + regex2 + ": " + matches5);   

        String str5 = "hello123world";  
        String regex3 = "hello.*world"; 
        boolean matches6 = str5.matches(regex3);  
        System.out.println(str5 + " matches " + regex3 + ": " + matches6); 
    }  
}