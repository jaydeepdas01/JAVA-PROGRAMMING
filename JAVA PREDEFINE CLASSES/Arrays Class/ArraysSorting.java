import java.util.Arrays;

public class ArraysSorting {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 12, 55, 99, -1, 0 };

        System.out.println("Given Array : " + Arrays.toString(arr));
        // sort Array in ascendig order using arrays class method

        System.out.println("Using Arrays.sort(arr) Method : ");
        Arrays.sort(arr);
        System.out.println("After sort :  " + Arrays.toString(arr));

        System.out.println();

        // sort in range or subarray.
        int[] arr2 = { 1, 5, 3, 9, 2, -9 };

        System.out.println("Given Array : " + Arrays.toString(arr2));
        // sort Array in ascendig order using arrays class method

        System.out.println("Using Arrays.sort(arr,fromIndex,toIndex) Method : ");
        Arrays.sort(arr2, 3, (arr2.length - 1));
        System.out.println("After sort :  " + Arrays.toString(arr2));
    }

}