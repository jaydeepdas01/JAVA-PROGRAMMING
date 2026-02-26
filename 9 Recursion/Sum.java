public class Sum {
    public static void main(String[] args) {
        int start = 1, end = 3, sum = 0;

        int result = sum(start,end,sum);
        System.out.println("Sum of " + start + " to " + end + " : " + result);
    }

    static  int sum(int a , int z , int sum){
        if (a >z) {
            return sum;
        }

        sum = sum + a;
        
       return  sum(a+1, z, sum);
    }
}
