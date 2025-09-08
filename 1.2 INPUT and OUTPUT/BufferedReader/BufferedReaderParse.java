import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderParse {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first number : ");
        String str1 = br.readLine(); // readLine() → always returns String
        int num1 = Integer.parseInt(str1); // Convert String to int using parseInt()

        System.out.print("Enter second number : ");
        String str2 = br.readLine();
        int num2 = Integer.parseInt(str2); // Convert String to int using parseInt()

        System.out.println("Result : " + (num1 + num2)); // Performs mathematical addition
    }
}
