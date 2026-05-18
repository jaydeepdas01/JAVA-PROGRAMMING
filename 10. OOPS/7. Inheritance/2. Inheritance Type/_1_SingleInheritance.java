//single Inheritance
// when a child class inherit from only one parent class.
class A {
    void display() {
        System.out.println("class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

public class _1_SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.show();
    }
}
