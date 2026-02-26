import java.util.Arrays;

public class ArraysToString {
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};

    //converting array to a String , it also use to display the arrya;
    // It only use for 1D arry
    String str = Arrays.toString(arr);
    System.out.println(str);

    // for 2D array
    int[][] arr2d ={
        {1,2},
        {4,5,6},
        {7},
    };

    String str2d = Arrays.deepToString(arr2d);
    System.out.println(str2d);
}
}
