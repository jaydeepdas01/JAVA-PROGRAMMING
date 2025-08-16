import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter alphabet : ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        sc.close();

        if ((ch >= 'a' && ch <= 'z') ) {

            switch (ch) {

                case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
                default -> System.out.println("consonant");
            }

        } else {
            System.out.println("Please enter valid input(Only Alphabets.).");
        }

    }
}
