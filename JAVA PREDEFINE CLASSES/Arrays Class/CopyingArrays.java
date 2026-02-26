import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Original array : " + Arrays.toString(arr));

        //copy element upto length 5 form the pasing array./;
        int[] copyArray = Arrays.copyOf(arr,5);
        System.out.println(Arrays.toString(copyArray));

        //copy array between in range
        System.out.println("Copy array in a given Range : ");
        int[] copyArrayRange = Arrays.copyOfRange(arr,3,7);
        System.out.println(Arrays.toString(copyArrayRange));

    }
}
