 
abstract class Animal {  
      
    public abstract void makeSound();  
    public void eat() {  
        System.out.println("Animal is eating.");  
    }   
    public void sleep() {  
        System.out.println("Animal is sleeping.");  
    }  
}  


class Dog extends Animal {  

    
    @Override  
    public void makeSound() {  
        System.out.println("Woof!");  
    }  

    
    public void demonstrateCallFromChild() {  
        Dog anotherDog = new Dog();  

        
        anotherDog.eat();     
        anotherDog.sleep();   
    }  
}  

public class childnonabstract {  
    public static void main(String[] args) {  
         
        Dog myDog = new Dog();  

         
        myDog.demonstrateCallFromChild();  
    }  
}