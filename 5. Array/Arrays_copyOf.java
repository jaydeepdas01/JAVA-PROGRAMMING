import java.util.Arrays;

public class Arrays_copyOf {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(Arrays.copyOf(arr,3)));
        System.out.println(Arrays.toString(Arrays.copyOf(arr, 5)));
        System.out.println(Arrays.toString(Arrays.copyOf(arr, 10)));
    }
   }
