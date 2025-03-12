
abstract class Animal {
    
    
    public abstract void sound();
    
    
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}


class Dog extends Animal {
    
    
    public void sound() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Animal myDog = new Dog();
        
        
        myDog.sound(); 
        
       
        myDog.sleep();  
    }
}
