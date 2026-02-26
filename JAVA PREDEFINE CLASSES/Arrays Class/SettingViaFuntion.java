import java.util.Arrays;

public class SettingViaFuntion {
    public static void main(String[] args) {

        int[] arr = new int[5];

        Arrays.setAll(arr,i-> i*2 );
        System.out.println(Arrays.toString(arr));
 
        int[] arr2 = new int[5];

        Arrays.parallelSetAll(arr,i-> i*3);
        System.out.println(Arrays.toString(arr2));

    }
}
