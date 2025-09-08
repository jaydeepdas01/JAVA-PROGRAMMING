import java.io.*;

public class BufferedReaderParse2 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first Number : ");
        int num1 = Integer.parseInt(br.readLine()); // Convert String → int directly

        System.out.print("Enter second Number : ");
        int num2 = Integer.parseInt(br.readLine()); // Convert String → int directly

        System.out.println("Addition : " + (num1 + num2)); // Perform mathematical addition
    }
}
