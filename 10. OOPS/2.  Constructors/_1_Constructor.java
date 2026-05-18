class Example {

    int x; // instance variable.

    Example() {
        x = 10; // initializaing x;
    }

    void show() {
        System.out.println(x);
    }
}

public class _1_Constructor {
    public static void main(String[] args) {
        Example obj1 = new Example(); // constructor called here.
        obj1.show();

        Example obj2 = new Example(); // constructor called here.
        obj2.show();

        Example obj3 = new Example(); // default value 10 , but we reinitialize x = 20 for obj3.
        obj3.x = 20;
        obj3.show();

    }
}