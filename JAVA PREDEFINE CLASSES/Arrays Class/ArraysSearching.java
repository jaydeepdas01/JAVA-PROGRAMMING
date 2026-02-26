import java.util.Arrays;

public class ArraysSearching {
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,6,7,8,9};

        System.out.println("Array : " + Arrays.toString(arr));
        int index = Arrays.binarySearch(arr,5); // if present then sent index number 
        //if element not present than (-(insertion point) - 1) return.
        System.out.println("Searching element present at Index : " + index);

        //binary Search in a range
        int index2 = Arrays.binarySearch(arr,3,(arr.length-1),7);
          System.out.println("Searching(int range) element present at Index : " + index2);
    }

}
