package Abstraction;
abstract class Animal {
    // Abstract method (no implementation)
    abstract void makeSound();
    
    // Concrete method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.makeSound(); // Outputs: Woof!
        myDog.eat(); // Outputs: This animal eats food.

        myCat.makeSound(); // Outputs: Meow!
        myCat.eat(); // Outputs: This animal eats food.
    }
}
