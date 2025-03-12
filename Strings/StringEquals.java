public class StringEquals{  

    public static void main(String[] args) {  
        String str1 = "Hello";  
        String str2 = "Hello";  
        String str3 = new String("Hello");  
        String str4 = "World";  

        
        boolean equals1 = str1.equals(str2);  
        System.out.println("str1.equals(str2): " + equals1);
        boolean equals2 = str1.equals(str3);  
        System.out.println("str1.equals(str3): " + equals2); 
        boolean equals3 = str1.equals(str4);  
        System.out.println("str1.equals(str4): " + equals3);  
        boolean equals4 = (str1 == str2);  
        System.out.println("str1 == str2: " + equals4);  
        boolean equals5 = (str1 == str3);  
        System.out.println("str1 == str3: " + equals5); 
    }  
}