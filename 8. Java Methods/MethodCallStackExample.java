public class MethodCallStackExample {
    public static void main(String[] args) {

        // calling non static method.
        MethodCallStackExample obj = new MethodCallStackExample();
        obj.A();
        // static method no need to create object.
        D();

    }

    // non static method does not need to create obj to all another non static
    // method in the same class.
    // Instance Method.
    void A() {
        B();
        System.out.println("In Method A.");
    }

    void B() {
        C();
        System.out.println("In Method B.");
    }

    void C() {
        System.out.println("In Method C.");
    }

    // static method
    static void D() {
        System.out.println("In Method D.");
    }
}
