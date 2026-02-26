import java.util.Arrays;

public class DifferentReturnType {
    public static void main(String[] args) {

        returnVoid();
        System.out.println(returnInteger());
        System.out.println(returnLong());
        System.out.println(returnFloat());
        System.out.println(returnDouble());
        System.out.println(returnChar());
        System.out.println(returnString());

        int arr[] = returnArray();
        System.out.println(Arrays.toString(arr));
    }

    // void return type: does not return any value
    static void returnVoid() {
        System.out.print("returnVoid() Return type,there is nothing to return.");
    }

    // int return type: returns an integer value
    static int returnInteger() {
        System.out.print("returnInteger() method return Integer value : ");
        return 10;
    }

    // long return type: returns a long value
    static long returnLong() {
        System.out.print("returnLong() method return Long value : ");
        return 1000000000;
    }

    // float return type: returns a floating point value
    static float returnFloat() {
        System.out.print("returnFloat() Method return Floating value : ");
        return 100.0f;
    }

    // double return type: returns a double value
    static double returnDouble() {
        System.out.print("returnDouble() Method return double value : ");
        return 100.10;
    }

    // char return type: returns a single character
    static char returnChar() {
        System.out.print("returnChar() method return Character value : ");
        return 'A';
    }

    // String return type: returns a string
    static String returnString() {
        System.out.print("returnString() method return Integer value : ");
        return "Hello, Wordl!!";
    }

    // int array return type: returns an integer array
    static int[] returnArray() {
        System.out.print("returnArray() method return array value : ");
        return new int[] { 10, 20, 30 };
    }
}
