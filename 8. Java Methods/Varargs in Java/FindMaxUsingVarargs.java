import java.io.*;
import java.util.Arrays;

public class FindMaxUsingVarargs {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[5];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Maximum in Array : " + max(arr));
        System.out.println("Maximum in Array : " + min(arr));
    }

    // Varargs finding maximum element.

    static int max(int... num) {
        int max;

        //we can use indexing in varargs in fatching data.
        max = num[0];
        for (int i : num) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }

    static int min(int... num) {
        int min;

        min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }

        return min;
    }
}
