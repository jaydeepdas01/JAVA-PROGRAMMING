import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        String reverse = "";

        for(int i = str.length()-1;i>=0;i--){

            char ch = str.charAt(i);
            reverse += ch;
        }

        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }


    }
}

