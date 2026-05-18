class Parent {
    Parent() {
        System.out.println("I am parent constructor.");
    }
}

// child class cannot inherit parent constructor only can call.
class Child extends Parent {
    Child() {
        // super(); automatically by java complier only for default constructor.
        //but in parameterized constructor we need toh manully wrire super() keyword with parameter.
        System.out.println("I am child Constructor.");
    }
}

public class _2_DefaultConstructor {
    public static void main(String[] args) {
        //constructor called automatically when object is created.
        Child child = new Child();// first called parent constructor then own.
    }
}
