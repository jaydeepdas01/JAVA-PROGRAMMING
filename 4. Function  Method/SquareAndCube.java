import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        int square = square(num);
        int cube = cube(num);

        System.out.println("Squar of " + num + " = " + square);
        System.out.println("Cube  of " + num + " = " + cube);

    }

    static int square(int num) {
        return num * num;
    }

    static int cube(int num) {
        return num * num * num;
    }
}