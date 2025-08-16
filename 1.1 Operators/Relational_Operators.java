import java.util.Scanner;

public class Relational_Operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number : ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Relational Operators : ");
        System.out.println("num1 > num2  :" + (num1 > num2));
        System.out.println("num1 < num2  : " + (num1 < num2));
        System.out.println("num1 >= num2 : " + (num1 >= num2));
        System.out.println("num1 <= num2): " + (num1 <= num2));
        System.out.println("num1 == num2 : " + (num1 == num2));
        System.out.println("num1 != num2 : " + (num1 != num2));
    }
}
