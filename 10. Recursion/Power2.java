public class Power2 {
    public static void main(String[] args) {
        int result = power(2, 3);
        System.out.println(result);
    }
    static int power(int x,int n){
        if (n==0) {
            return 1;
        }
        return n*power(x, n-1);
    }
}
