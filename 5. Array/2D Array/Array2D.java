public class Array2D {
    public static void main(String[] args) {
        // 2 x 2 2D array declaration
        int[][] arr = new int[2][2];

        arr[0][0] = 10;
        arr[0][1] = 20;

        arr[1][0] = 30;
        arr[1][1] = 40;

        System.out.println(arr[0][0]); // print row 1 and col 1;
        System.out.println(arr[0][1]); // print row 1 and col 2;
        System.out.println(arr[0][0]); // print row 2 and col 1;
        System.out.println(arr[1][1]); // print row 2 and col 2;

    }
}