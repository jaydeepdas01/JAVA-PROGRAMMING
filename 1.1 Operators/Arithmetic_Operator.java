import java.util.Scanner;

public class Arithmetic_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number : ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Addition : " + (num1 + num2));
        System.out.println("Subtraction : " + (num1 - num2));
        System.out.println("Multiplication : " + (num1 * num2));
        System.out.println("Division : " + (num1 / num2));
        System.out.println("Reminder : " + (num1 % num2));
    }
}