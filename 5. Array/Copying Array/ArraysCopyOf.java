import java.util.Arrays;

public class ArraysCopyOf {
     public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int[] copy = Arrays.copyOf(arr,arr.length);

        System.out.println(Arrays.toString(copy));
       }
}
