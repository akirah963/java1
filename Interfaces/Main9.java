
interface Animal {

    String TYPE = "Mammal";      
    int LEGS = 4;           
    void makeSound();
}
class Dog implements Animal {
    final  String name;
    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void makeSound() {
        System.out.println(name + " says Woof!");
    }
    public void displayDetails() {
        System.out.println("Animal Type: " + TYPE);
        System.out.println("Number of Legs: " + LEGS);
        System.out.println("Dog Name: " + name);
    }
}
public class Main9 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy"); 
        myDog.makeSound();             
        myDog.displayDetails();       
    }
}