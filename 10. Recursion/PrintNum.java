public class PrintNum {
    public static void main(String[] args) {
        printNum(5);
    }

     static void printNum(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        printNum(num - 1);
    }
}