class Parent2 {  
    private String name;  

    public Parent2() {  
        System.out.println("Parent class default constructor called");  
        this.name = "DefaultParent";  
    }  

    public Parent2(String name) {  
        System.out.println("Parent class parameterized constructor called with name: " + name);  
        this.name = name;  
    }  

    public String getName() {  
        return name;  
    }  
}  

class Child extends Parent2 {  
    private int age;  

    public Child() {  
        super(); 
        System.out.println("Child class default constructor called");  
        this.age = 0;  
    }  

    public Child(String name, int age) {  
        super(name); 
        System.out.println("Child class parameterized constructor called with age: " + age);  
        this.age = age;  
    }  

    public static void main(String[] args) {  
        Child child1 = new Child();   
        System.out.println("Child 1 name: " + child1.getName());  

        Child child2 = new Child("ChildName", 10);  
        System.out.println("Child 2 name: " + child2.getName());  
    }  
}  