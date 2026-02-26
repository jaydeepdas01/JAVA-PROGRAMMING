import java.util.Arrays;

public class Clone {
     public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int[] copy = arr.clone();
        System.out.println(Arrays.toString(copy));
       }
}
