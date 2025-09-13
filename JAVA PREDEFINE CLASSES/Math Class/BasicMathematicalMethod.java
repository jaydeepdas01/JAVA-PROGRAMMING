public class BasicMathematicalMethod {
    public static void main(String[] agrs) {

        System.out.println("Math.abs(-10)    : " + Math.abs(-10));

        System.out.println("Math.max(5,9)    : " + Math.max(5, 9));

        System.out.println("Math.min(5,9)    : " + Math.min(5, 9));

        System.out.println("Math.pow(2,3)    : " + Math.pow(2, 3));

        System.out.println("Math.sqrt(25)    : " + Math.sqrt(25));

        System.out.println("Math.cbrt(27)    : " + Math.cbrt(27));

        // signum -1.0 for -ve, 0.0 for 0, 1.0 for +ve;
        System.out.println("Math.signum(-10) : " + Math.signum(-10));
        System.out.println("Math.signum(0)   : " + Math.signum(0));
        System.out.println("Math.signum(10)  : " + Math.signum(10));
    }
}