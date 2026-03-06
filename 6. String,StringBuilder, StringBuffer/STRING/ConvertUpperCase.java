import java.util.Scanner;

public class ConvertUpperCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        String result = "" ; // empty string

        // Loop har character par chalega
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // i-th character nikalo

            // Agar lowercase letter hai ('a' to 'z')
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32); // ASCII value me se 32 kam karke uppercase banao
            } else {
                result += ch; // Agar lowercase nahi hai to as-it-is add karo
            }
        }

        System.out.println(result);
        sc.close();
    }
}
