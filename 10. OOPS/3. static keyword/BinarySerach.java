public class BinarySerach {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int start = 0;
        int end = arr.length - 1;

       
        int target = 1;
        int result = -1;

        while (start <= end) {
           int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                result = mid;
                break;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (result == -1) {
            System.out.println("Not present");
        } else {
            System.out.println("present at index " + result);
        }

    }
}
