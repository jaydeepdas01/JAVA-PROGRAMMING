import java.util.Scanner;

public class InputMethod{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer : ");
        int num = sc.nextInt(); // nextByte(), nextShort(), nextLong() depending on data type

        System.out.println("Enter float : ");
        double flore = sc.nextDouble(); // nextFloat() depending on data type

        System.out.println("Enter character : ");
        char ch = sc.next().charAt(0); // only take single letter 

        System.out.println("Enter String(single word) : "); // only take one word, no space allowed
        String word = sc.next();

        sc.nextLine(); // <<< FIX: consume leftover newline before multi-line input

        System.out.println("Enter String (multiple line) : "); // can print entire line
        String str = sc.nextLine();

        System.out.println("Enter Boolean : "); // taking true/false input
        boolean bool = sc.nextBoolean();

        System.out.println("Integer Result : " + num);
        System.out.println("Floating Result : " + flore);
        System.out.println("Character Result : " + ch);
        System.out.println("String word Result : " + word);
        System.out.println("String multiline Result : " + str);
        System.out.println("Boolean Result : " + bool );
    }
}
