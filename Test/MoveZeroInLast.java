import java.util.Arrays;

public class MoveZeroInLast {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 4 };

        int temp;
        int end = arr.length - 1;

       
        int i = 0;

      while(i<end) {
             
            if (arr[end] == 0) {
                end--;
            }

            if (arr[i] == 0) {
                temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
            }
            i++;
            end--;
        }
    
        System.out.println(Arrays.toString(arr));
}
}
