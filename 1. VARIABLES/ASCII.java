import java.util.Scanner;

public class ASCII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Alphabet : ");

        char ch = sc.next().charAt(0);

        int a = ch; // Intrinsic type casting;
        System.out.println("'" + ch+ "'"+ " ASCII value : " + a);

    }
}
