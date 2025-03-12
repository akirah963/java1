public class StringIndexOf {  

    public static void main(String[] args) {  
        String str = "Hello World";  

        
        int index1 = str.indexOf("World");  
        System.out.println("Index of 'World': " + index1);  
        int index2 = str.indexOf("o");  
        System.out.println("Index of 'o': " + index2);  
        int index3 = str.indexOf("o", 5);  
        System.out.println("Index of 'o' starting from index 5: " + index3); 
        int index4 = str.indexOf("Z");  
        System.out.println("Index of 'Z': " + index4);   
        int index5 = str.indexOf("");  
        System.out.println("Index of '': " + index5);  
        String str2 = "abababab";  
        int index6 = str2.indexOf("ab", 2);  
        System.out.println("Index of 'ab' starting from index 2: " + index6);   
    }  
}