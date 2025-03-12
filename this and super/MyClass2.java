class MyClass2 {  
    private int x;  
    private int y;  

     
    public MyClass2(int x, int y) {  
        this.x = x;  
        this.y = y;  
        System.out.println("Constructor with two arguments called: x = " + x + ", y = " + y);  
    }  

   
    public MyClass2(int x) {  
        this(x, 0);  
        System.out.println("Constructor with one argument called: x = " + x);  
    }  

     
    public MyClass2() {  
        this(10);   
        System.out.println("No-argument constructor called");  
    }  

    public static void main(String[] args) {  
        MyClass2 obj1 = new MyClass2();        
        MyClass2 obj2 = new MyClass2(5);    
        MyClass2 obj3 = new MyClass2(2, 7); 
    }  
}  