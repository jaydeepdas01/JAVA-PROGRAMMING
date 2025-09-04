import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0, digit;
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        sc.close();
        // store orignal number
        int temp = num;

        // handle edge case for maintain loop condition.
        if (num < 0) {
            num = -num;
        }
        for (; num > 0; num = num / 10) {
            digit = num % 10;
            rev = (rev * 10) + digit;
        }
        // using ternory operator for taking desicion.
        rev = (temp < 0) ? -rev : rev;
        System.out.println("Reverse of given number : " + rev);

        // if (temp < 0)
        // System.out.println("Reverse of given number : -" + rev);
        // else {
        // System.out.println("Reverse of given number : " + rev);
        // }
    }

}
