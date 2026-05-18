abstract class Animal {

    // abstract method no need implimentation in the abstract class
    // but in the child class must be implemented.
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// also use the concept of PolymorPhism.
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class _2_AbstractMethod {
    public static void main(String[] args) {

        Animal animalRef; // patent referece variable.
        animalRef = new Dog(); // animal ref point to tha Dog class object
        animalRef.makeSound(); // caling Dog makeSound()

        animalRef = new Cat();// animal ref point to tha cat class object
        animalRef.makeSound();// calling Cat makeSound();
    }
}