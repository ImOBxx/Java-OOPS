
class Animal1 {
    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog1 extends Animal1 {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class OOPsAnimal {
    public static void main(String[] args) {
        Animal1 myAnimal = new Animal1();  // Animal reference and object
        Animal1 myDog = new Dog1();        // Animal reference but Dog object

        myAnimal.makeSound();            // Outputs: Animal makes a sound
        myDog.makeSound();               // Outputs: Dog barks
    }
}