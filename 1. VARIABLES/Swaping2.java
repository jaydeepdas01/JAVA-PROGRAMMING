
import java.util.Scanner;

public class Swaping2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the firse number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        sc.close();

        System.out.printf("Before swap a = %d and b = %d ", a, b);

        // swaping algorithm without using third variagle.

        a = a+b; //a = 10+20 = 30
        b = a-b; // 30 -20 = 10
        a = a-b; // 30 -10 = 20;
        //so , a = 20 and b = 20;

        System.out.println();
        System.out.printf("After swap a = %d and b = %d ", a, b);
    }
}
