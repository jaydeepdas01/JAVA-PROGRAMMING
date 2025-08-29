public class Return {
    public static void main(String[] args) {
        // Calling the method and storing the returned value in ans
        int ans = returnKeyword(5, 10);

        // Printing the result returned by the method
        System.out.println(ans);
    }

    // Method that uses 'return' to send back a value to the caller
    static int returnKeyword(int a, int b) {
        // If a is greater than b, return their sum
        if (a > b)     
            return a + b;
        else
            // Otherwise, return the difference (b - a)
            return b - a;
    }
}
