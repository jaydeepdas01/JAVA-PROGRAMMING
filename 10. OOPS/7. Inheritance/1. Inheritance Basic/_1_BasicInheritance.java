class Animal{ 

    void eat(){
        System.out.println("Animal is eating.");
    }
}

// "extends" keyword use to create inheritance between classes.
class Dog extends Animal{ // class dog inherit class animal.

void bark(){
    System.out.println("Dog is Barking.");
}
}

public class _1_BasicInheritance {

    public static void main(String[] args) {
        //creating Dog class object which inherit Animal class
        Dog dog1 = new Dog();
        dog1.eat(); // it can use animal class member , because dog class inherit animal class
        dog1.bark(); // dog class own method.
    }
}