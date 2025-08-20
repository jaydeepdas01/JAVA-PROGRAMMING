import java.util.Scanner;

public class CharInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char ch;

        System.out.println("Enter a character : ");
        ch = sc.next().charAt(0);

        System.out.println(ch);
    }
}
