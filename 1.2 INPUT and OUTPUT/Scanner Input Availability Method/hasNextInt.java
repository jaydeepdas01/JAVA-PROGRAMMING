import java.util.Scanner;

public class hasNextInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number  : ");

        if (sc.hasNextInt()) { // check input integer or not if integer return true execute if block else else
                               // block
            int num = sc.nextInt();
            System.out.println("Result : " + num);
        } else {
            System.out.println("Input is not an Integer.");
        }
    }
}