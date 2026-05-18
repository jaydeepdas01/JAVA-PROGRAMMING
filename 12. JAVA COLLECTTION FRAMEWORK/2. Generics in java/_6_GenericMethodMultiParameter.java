public class _6_GenericMethodMultiParameter {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        printData(a, b); 

        // for Integer
        Integer x = 30;
        Integer y = 40;
        printData(x, y);
        //or
        printData(50,60 );

        // for String'
        String s1 = "Hello";
        String s2 = " World.";
        printData(s1, s2);
    }

    // multi parameter generic method
    static <T, U> void printData(T a, T b) {

        System.out.println("First : " + a);
        System.out.println("Second : " + b);
    }
}
