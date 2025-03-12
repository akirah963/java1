
class Parent {  
    public void doSomething() {  
        System.out.println("Parent's doSomething");  
    }  
}  

class Child extends Parent {  
    @Override  
    public void doSomething() {  
        System.out.println("Child's doSomething");  
        super.doSomething(); // Calls the Parent's doSomething method  
        System.out.println("Child's doSomething after parent");  
    }  

    public static void main(String[] args) {  
        Child child = new Child();  
        child.doSomething();  
    }  
}  