import java.util.Scanner;

public class AreaOFCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the circle radius : ");
        double radius = sc.nextDouble();

        double areaOfCircle = area(radius);
        System.out.println("The area of circle : " + areaOfCircle );

        sc.close();

    }

    static double area(double radius){
        // final double PI = 3.14f;
        // Math.PI is a built-in constant in Java's Math class representing the value of π (pi)
        return Math.PI *radius*radius;
    } 
}
