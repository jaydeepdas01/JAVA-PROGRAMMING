interface Animal {
    void sound(); // it's internally public abstract void show();

}

// abstract method must be override. or make tha class abstract.
// else it show error
class Dog implements Animal {

    @Override
    public void sound() { // public because of interface method are public abstract.
        System.out.println("Dog Barks!!!!");
    }
}

public class _1_Interface {
    public static void main(String[] args) {
        Animal A = new Dog(); // dynamic method dispatch.
        A.sound();
    }
}