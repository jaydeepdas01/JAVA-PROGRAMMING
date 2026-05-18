abstract class A {
    abstract void show();

    A(String Hello) {
        System.out.println(Hello);
    }
}

class B extends A {
    void show() {
        System.out.println("Hello how are you.");
    }

    B(String Hello) {
        super(Hello);

    }
}

public class Practics {

    public static void main(String[] args) {
        A a = new B("Hello");
        a.show();
    }
}
