import java.util.Arrays;
 
public class SearchngOrCheckingProperties{
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println("given Array : " + Arrays.toString(arr));
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("min : " + min);
            int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("max : " + max);

        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum : " + sum);
    }
}