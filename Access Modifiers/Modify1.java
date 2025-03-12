 
class Modify1 {  
    private String privateField = "This is a private field.";  
    private int privateNumber = 10;  

    private void privateMethod() {  
        System.out.println("This is a private method.");  
    }  

    public static void main(String[] args) {  
        Modify1 obj = new Modify1();  

        
        System.out.println("Private Field: " + obj.privateField);  
        System.out.println("Private Number: " + obj.privateNumber);  

       
        obj.privateMethod();  
    }  
}  

 
class SubClass extends Modify1 {  
    public void accessPrivateMembers() {  
       
        System.out.println("Cannot access private members from a subclass.");  
    }  

    public static void main(String[] args) {  
        SubClass subObj = new SubClass();  
        subObj.accessPrivateMembers(); 
    }  
}  