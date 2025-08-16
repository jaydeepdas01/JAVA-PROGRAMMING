import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = (a>b)? a : b; // if (a>b)? conditon true print a else print b.
        System.out.println(max);
    }
}
