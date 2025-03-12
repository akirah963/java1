
interface Animal {
    void eat();
}

interface Dog extends Animal {
    void bark();
}
class Puppy implements Dog {
    @Override
    public void eat() {
        System.out.println("The puppy is eating.");
    }

    @Override
    public void bark() {
        System.out.println("The puppy is barking.");
    }
}


public class Main6{
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.eat();  
        myPuppy.bark(); 
    }
}