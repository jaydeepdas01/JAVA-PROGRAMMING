public class PrintSum_1_to_10 {
    public static void main(String[] args) {
       
            int result = printSum(10);
        System.out.println("Sum : " + result);
    }

    static int printSum(int num) {
        if (num == 1) {
            return 1;
        }

        return num + printSum(num - 1);
    }
}
