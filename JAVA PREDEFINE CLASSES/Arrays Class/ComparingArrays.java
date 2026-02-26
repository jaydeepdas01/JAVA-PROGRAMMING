import java.util.Arrays;

public class ComparingArrays {
    public static void main(String[] args) {
        // check if arrays are same length & elements.,for 1D array
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        int[] arr3 = { 2, 5, 4 };
        int[] arr4 = { 1, 2, 3, 4 };

        System.out.println("Arrays.equals(arr1,arr2) for 1D array : ");

        System.out.println("Is arr1 and arr2 Equal : " + Arrays.equals(arr1, arr2));// length and element both equal
        System.out.println("Is arr1 and arr3 Equal : " + Arrays.equals(arr1, arr3));// length equal but not elements
        System.out.println("Is arr1 and arr4 Equal : " + Arrays.equals(arr1, arr4));// all elements are not equal and
                                                                                    // length also not equal                                                                            // for multidimensional Array.
        int[][] arr2d_1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
        };
        int[][] arr2d_2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
        };
        int[][] arr2d_3 = {
                { 1, 2, 3 },
                { 7, 8, 9 },
        };

        int[][] arr2d_4 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 1, 2 },
        };

        System.out.println("Arrays.deepEquals(arr2d_1,arr2d_2) for multidimensional array : ");
        System.out.println("Is arr2d_1 and arr2d_2 Equal : " + Arrays.deepEquals(arr2d_1, arr2d_2));// length and element both equal
        System.out.println("Is arr2d_1 and arr2d_3 Equal : " + Arrays.deepEquals(arr2d_1, arr2d_3));// length equal but not elements
        //when length and element both are diffrent.
        System.out.println("Is arr2d_1 and arr2d_4 Equal : " + Arrays.deepEquals(arr2d_1, arr2d_4));


    System.out.println("Arrys.mismatch(arr1,arr2)");
    //if array are differ then return first index;
    System.out.println("Differ array : " +Arrays.mismatch( arr1,arr3));
//if array are same then return -1;
    System.out.println("Same array : " +Arrays.mismatch( arr1,arr2));

    }
}
