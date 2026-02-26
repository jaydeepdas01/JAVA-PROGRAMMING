public class MethodOverLoading {
    public static void main(String[] args) {

        int a = add(10, 10);          // calls add(int, int)
        int b = add(10, 10, 10);      // calls add(int, int, int)
        float c = add(11.1f, 11.1f);  // calls add(float, float)
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    // Method overloading example: 2 int parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Method overloading example: 3 int parameters
    static int add(int a, int b, int c) {
        return a + b + b;  // note: probably should be a+b+c
    }

    // Method overloading example: 2 float parameters
    static float add(float a, float b) {
        return a + b;
    }
}
