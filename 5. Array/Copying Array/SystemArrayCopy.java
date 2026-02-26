import java.util.Arrays;

public class SystemArrayCopy {
       public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int[] copy = new int[arr.length];

       System.arraycopy(arr,0,copy,0,arr.length);

        System.out.println(Arrays.toString(copy));
       }
}
