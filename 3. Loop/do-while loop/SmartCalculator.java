import java.util.Scanner;

public class SmartCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enter;

        do {
            // menu call
            menu();
            System.out.println("*****************************");
            System.out.print("Select Operation: ");
            enter = sc.nextInt();

            if (enter == 5) {
                System.out.println("Program end, Thank you!!");
                break;
            }

            // only execute when enter > 0 and enter < 5
            if (enter >= 1 && enter <= 4) {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                if (enter == 1) {
                    System.out.println("\nResult: " + add(num1, num2));
                    System.out.println("*****************************");
                } else if (enter == 2) {
                    System.out.println("\nResult: " + sub(num1, num2));
                    System.out.println("*****************************");
                } else if (enter == 3) {
                    if (num2 == 0) {
                        System.out.println("Divisible by 0 not allow.");
                        System.out.println("*****************************");
                    } else {
                        System.out.println("\nResult: " + divide(num1, num2));
                        System.out.println("*****************************");
                    }
                } else {
                    System.out.println("\nResult: " + multi(num1, num2));
                    System.out.println("*****************************");
                }
            }

        } while (true);
    }

    // Operation methods.
    static double add(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double multi(double a, double b) {
        return a * b;

    }

    static double divide(double a, double b) {

        return a / b;
    }

    // Menu
    static void menu() {
        System.out.println("Press 1 : Addition.");
        System.out.println("Press 2 : Subtraction.");
        System.out.println("Press 3 : Division.");
        System.out.println("Press 4 : Multiplication.");
        System.out.println("5 : EXIT.");
    }

}