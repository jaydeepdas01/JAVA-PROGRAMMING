import java.util.Scanner;

public class PalindromeCheck {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word : ");

        String str;
        StringBuilder sb = new StringBuilder(str = sc.next());

        sb.reverse();
        System.out.println("After reverse : " + sb);
        if (str.equals(sb.toString())) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
