import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of length : ");
        double length = sc.nextDouble();
        System.out.print("Enter the size of breadth :");
        double breadth = sc.nextDouble();

        System.out.print("Enter the unit (cm²((1)) / m²(2) / km²(3)) press 1,2 or 3.. : ");
        byte num = sc.nextByte();

        sc.close();

        double area = length * breadth;

        switch (num) {
            case 1 -> System.out.println("The area of Rectangle : " + area + " cm²");
            case 2 -> System.out.println("The area of Rectangle : " + area + " m²");
            case 3 -> System.out.println("The area of Rectangle : " + area + " km²");
            default -> System.out.println("The area of Rectangle : " + area);
        }

    }
}
