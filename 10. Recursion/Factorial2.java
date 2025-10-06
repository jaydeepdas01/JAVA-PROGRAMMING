public class Factorial2 {
    public static void main(String[] args) {
        System.out.println(facto(5, 1));
    }

    static int facto(int n, int fact){

        if (n==0) {
            return fact;
        }
        fact = fact * n;
        return facto(n-1,fact);
    }
}
