import java.io.*;

public class ParsingMethod {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Integer : ");
        int i = Integer.parseInt(br.readLine()); // Converts input String to int

        System.out.print("Enter Float : ");
        float f = Float.parseFloat(br.readLine()); // Converts input String to float

        System.out.print("Enter Double : ");
        double d = Double.parseDouble(br.readLine()); // Converts input String to double

        System.out.print("Enter Boolean : ");
        boolean b = Boolean.parseBoolean(br.readLine()); 
        // Returns true only if input is "true" (case-insensitive)
        // For any other input (false, yes, 1, anything else) it will return false

        System.out.print("Enter Long : ");
        long l = Long.parseLong(br.readLine()); // Converts input String to long

        System.out.print("Enter String : ");
        String s = br.readLine(); // Takes the input as a String (no conversion)

        System.out.println("Integer  : " + i);
        System.out.println("Float    : " + f);
        System.out.println("Double   : " + d);
        System.out.println("Boolean  : " + b);
        System.out.println("Long     : " + l);
        System.out.println("String   : " + s);

    }
}
