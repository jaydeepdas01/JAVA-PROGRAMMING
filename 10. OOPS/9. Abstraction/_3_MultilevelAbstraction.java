abstract class Animal2 {
    abstract void sound(); // . abstract method.
}

abstract class Mammal extends Animal2 {
    void breath() {
        System.out.println("mammal breating.");

    }

    // sound() is still abstract here.
    // you must make child class abstract of implement the abstract method.
}

class Dog extends Mammal {

    // implemented in non abstract class
    @Override
    void sound() {

        System.out.println("Woof!!");
    }
}

public class _3_MultilevelAbstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.breath(); // inherited from mammal
        d.sound();// abstracted method.
    }
}
