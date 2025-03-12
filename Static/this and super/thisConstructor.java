class thisConstructor {  
    private int x;  
    private int y;  

    
    public thisConstructor(int x, int y) {  
        this.x = x;  
        this.y = y;  
        System.out.println("Constructor 1 called with x = " + x + ", y = " + y);  
    }  

      
    public thisConstructor(int x) {  
        this(x, 0);  
        System.out.println("Constructor 2 called with x = " + x);  
    }  

    
    public thisConstructor() {  
        this(10);    
        System.out.println("Constructor 3 called");  
    }  

    public static void main(String[] args) {  
        thisConstructor obj1 = new thisConstructor();       
        thisConstructor obj2 = new thisConstructor(5);    
        thisConstructor obj3 = new thisConstructor(2, 7); 
    }  
}  