import java.util.Scanner;
//String reverse without any buit-in menthod.
public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse += ch;
        }

        System.out.println("Before Reverse : " + str);
        System.out.println("After Reverse : " + reverse);

    }
}
