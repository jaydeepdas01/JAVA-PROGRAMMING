// if a class implements tow interfaces having the same default method.
// the class must oveerride the method to resolve ambiguity.

interface A {

    default void show() {
        System.out.println("I am from interface A");
    }
}

interface B {
    // same method name as the interface A show method.
    default void show() {
        System.out.println("I am form interface B");
    }
}

// both interface have same name of the default method so we must override the
// default method.
// because C don't know which method should call
class C implements A, B {

    @Override
    public void show() {
        System.out.println("I am overriden show.");
    }
}

public class _5_DefaultmethodConflict {
    public static void main(String[] args) {

        C c = new C();
        c.show();
    }
}
