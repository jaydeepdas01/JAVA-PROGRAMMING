public class PrintArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int index = 0;
        System.out.println("Printing array using recursive method : ");
        printArr(arr, index);
    }

    static void printArr(int[] arr, int i) {
        if (i> arr.length-1) {
            return;
        }
        System.out.print(arr[i] + " ");

        printArr(arr, i + 1);
    }
}
