import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character to check vowel or cosonant : ");
        char ch = sc.next().charAt(0);
        System.out.println("You entered : " + ch);


        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It is a Vowel.");
        } else  {
            System.out.println("It is a consonant.");
        }
    }
}