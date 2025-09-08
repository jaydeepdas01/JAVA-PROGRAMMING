import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Example: Taking input using BufferedReader.
 * 
 * Key Points:
 * 1. BufferedReader is a character-based input class (faster than Scanner for bulk reading).
 * 2. readLine() always returns a String (even if you enter a number).
 * 3. readLine() can throw IOException → must handle using try-catch or 'throws IOException'.
 */
public class BufferedReder_ {

    public static void main(String[] args) throws IOException {

        // Create BufferedReader object to read input from console.
        // InputStreamReader converts System.in (byte stream) to character stream.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // IMPORTANT: readLine() → returns entire line as String (no type conversion)
        // If you want int/double, you must parse manually using Integer.parseInt(), etc.
        System.out.print("Enter String: ");
        String str = br.readLine();
        System.out.println("You entered: " + str);

        System.out.print("Enter second String: ");
        String str2 = br.readLine();
        System.out.println("You entered: " + str2);

        // Concatenation of two Strings (not mathematical addition)
        System.out.println("After concatenation: " + (str + str2));

        br.close();
    }
}
