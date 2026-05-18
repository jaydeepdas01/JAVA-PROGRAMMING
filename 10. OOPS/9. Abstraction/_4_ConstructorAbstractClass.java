abstract class Vehcle2 {
    // constructor in abstract class.
    Vehcle2() {
        System.out.println("Vehicle constructor called");
    }

    // abstract method.
    abstract void start();
}

class Van extends Vehcle2 {
    Van() {
        super();// calling parent constructor.
        System.out.println("Van constructor Called.");
    }

    @Override
    void start() {
        System.out.println("Van Started.");
    }
}

public class _4_ConstructorAbstractClass {
    public static void main(String[] args) {
        Van van = new Van();
        van.start();
    }
}
