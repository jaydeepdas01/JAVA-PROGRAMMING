
class Animal2 {
    void eat() {
        System.out.println("Animal eats.");

    }

    void sleep() {
        System.out.println("Animal Sleep");
    }
}

class Dog2 extends Animal2 {

    @Override
    void eat() {
        System.out.println("Dog eats bones.");
    }

    void bark() {
        System.out.println("Dog barks.");
    }
}

public class _3_UpcastingAndDowncasting {
    public static void main(String[] args) {

        // Upcasting.
        Animal2 a = new Dog2();

        // only can access overridden method and parent members.
        a.eat();
        a.sleep();

        // a.bark() not accssibl3e via animal reference.to do that we need to do
        // downcastingl

        // Child ChildRef = (Child)parentRef.
        Dog2 d = (Dog2) a;// a downcasted to Dog 
        
        d.bark(); // now we can access bark() method. through child object.

    }
}
