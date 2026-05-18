public class _1_MethodOverloading {

    public static void main(String[] args) {

        // compiler deciede which method should called before complilation.
        System.out.println(add(10,20));
        System.out.println(add(10,20,20));
        System.out.println(add(2.5,2.5));
    }

    /*
     * Method oveerloading is creating multiple method with the same name but
     * diffrent parameter list in the same class.
     */
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }
}
