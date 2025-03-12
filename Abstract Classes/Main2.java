
abstract class Animal {
    
    
    public abstract void sound();
}

class Dog extends Animal {
    
    
    public void sound() {
        System.out.println("The dog barks.");
    }
    
    
    public void createInstanceAndCallSound() {
        
        Dog dogInstance = new Dog();
        
       
        dogInstance.sound(); 
    }

    public static void main(String[] args) {
       
        Dog myDog = new Dog();
        
        
        myDog.createInstanceAndCallSound();  
    }
}
