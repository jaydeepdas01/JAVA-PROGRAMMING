import java.util.Arrays;

public class FillingArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Before Arrays method : " + Arrays.toString(arr));
        // all array index fill with same value
        System.out.println("Arrays.fill(arr,10) : ");
        Arrays.fill(arr,10);
        System.out.println(Arrays.toString(arr));


        //fill same value with in a range : 
        System.out.println("Arrays.fill(array,fromIndex,toIndex,11) : ");
        Arrays.fill(arr,1,4,11);
        System.out.println(Arrays.toString(arr));

        
        

    }
}
