import java.util.Arrays;

public class oddEvenSeprate {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = new int[arr1.length]; // for even
        int[] arr3 = new int[arr1.length];// for odd

        int evenIndex = 0, oddIndex = 0;
        ;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr2[evenIndex] = arr1[i];
                evenIndex++;
            }
            if (arr1[i] % 2 != 0) {
                arr3[oddIndex] = arr1[i];
                oddIndex++;
            }
        }

        System.out.println("Original: " + Arrays.toString(arr1));
        System.out.print("Even : ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(arr2[i] + ", ");
        }

        System.out.println();

        System.out.print("Odd : ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(arr3[i] + ", ");
        }

        System.out.println("\nSecond print of print : ");
        System.out.println("Even : " + Arrays.toString(Arrays.copyOf(arr2, evenIndex)));
        System.out.println("Odd : " + Arrays.toString(Arrays.copyOf(arr3, oddIndex)));

    }
}
