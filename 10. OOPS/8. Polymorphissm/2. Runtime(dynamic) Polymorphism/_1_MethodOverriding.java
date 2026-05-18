class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");

    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class _1_MethodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.sound(); //own sound method call.
        c.sound();// own sound method call.

        //upcating.
        Animal a = new Dog();// patent reference , child object.
        Animal a2 = new Cat();

        a.sound();// Dog class sound() execute.
        a2.sound();// cat class sound() execute.

        // but sound method must present in Animal class during upcasting.
    }
}
