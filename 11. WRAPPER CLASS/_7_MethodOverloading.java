public class _7_MethodOverloading {
    public static void main(String[] args) {

        show(10);// call the primitive one.
        show(Integer.valueOf(10)); // calling wrapper one.
    }

    static void show(int a) {
        System.out.println("Primitive int");
    }

    static void show(Integer a) {
        System.out.println("Wrapper Integer ");
    }
}
