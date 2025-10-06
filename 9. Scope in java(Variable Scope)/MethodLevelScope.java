public class MethodLevelScope {

    public static void main(String[] args) {
        show();

       // System.out.println(x); Cannot access outside of the method.
    }

    static void show() {
        /*
         * Method level scope
         * Declared inside a method
         * accessable only with in that method.
         * memmory is created when method is call distroyed after method executiom
         */
        int x = 10;
        System.out.println("Method level scope : "+x);
    }
}
