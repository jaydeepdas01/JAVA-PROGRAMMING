import java.util.Scanner;
public class FindPower {
    public static void main(String[] args) {

        int result = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.print("Enter power : ");
        int power = sc.nextInt();

        int i = 1;
        while (i <= power) {
           result = num*result;
           i++;
        }

        System.out.println("Answer : " + result);

    }
}
