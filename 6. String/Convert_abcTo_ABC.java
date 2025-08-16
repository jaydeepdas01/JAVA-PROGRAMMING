import java.util.Scanner;

public class Convert_abcTo_ABC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character : ");

        // only one character input syntax.
        char ch = sc.next().charAt(0);
        System.out.println("Now converting into Capital letter without built in method.");

        if (ch >= 'a' && ch<='z') { // if input lowercase then run this block either already upper case 
            ch = (char)(ch-32);  // lowercase ka ASCII value me se 32 kam karke uppercase banate hain
        }

        System.out.println(ch);

    }
}
