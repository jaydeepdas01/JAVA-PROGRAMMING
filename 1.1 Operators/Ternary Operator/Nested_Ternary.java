import java.util.Scanner;

public class Nested_Ternary {
    public static void main(String[] args) {
        System.out.println("Enter three numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int  max = (a>b)? ((a>c)? a : c) : ((b>c)? b : c); // a>b then a>c? else b big now is b>c?
        System.out.println("Max : " + max);


    }
}