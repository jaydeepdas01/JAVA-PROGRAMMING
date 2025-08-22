import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
       System.out.println(reverseNumber(num));

    }

    static int reverseNumber(int num){
           int digit, rev=0;

        while (num > 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        return rev;
    }
}
