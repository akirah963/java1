class MyClass {  
    private String name = "MyObject";  
    private int value = 42;  

    public void printFields() {  
     
        System.out.println("Name: " + name);  
        System.out.println("Value: " + value);  

         
        System.out.println("Name (using this): " + this.name);  
        System.out.println("Value (using this): " + this.value);  
    }  

    public static void main(String[] args) {  
        MyClass obj = new MyClass(); 
        obj.printFields();          
    }  
}  