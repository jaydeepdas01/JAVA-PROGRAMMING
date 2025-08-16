import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int run = 1;
        while (run == 1) {

            instructions(); // function call
            System.out.println("Press Oprator : ");
            String ch = sc.next();

            // Enter two numbers
            System.out.println("Enter two number :");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();

            switch (ch) {
                case "+":
                    System.out.println("= " + (num1 + num2));
                    break;

                case "-":
                    System.out.println("= " + (num1 - num2));
                    break;

                case "*":
                    System.out.println("= " + (num1 * num2));
                    break;

                case "/":
                    if (num2 == 0) {
                        //edge case handle.
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("= " + (num1 / num2));

                    }
                    break;

                default:
                    System.out.println("Please enter from menu.");

            }

            // for programm continue or not
            System.out.println("For continue  press 1, for exit press any number");
            run = sc.nextInt();

            if (run != 1) {
                System.out.println("Program exit.");
                break;
            }
        }

    }

    static void instructions() {
        {
            System.out.println("Calculator Operators: +  -  *  /");
        }

    }
}
