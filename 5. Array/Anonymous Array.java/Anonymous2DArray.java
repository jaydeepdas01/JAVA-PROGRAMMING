public class Anonymous2DArray {
    public static void main(String[] args) {

        //jagged array also can be a 2D array.
        System.out.println("Printing anonymous 2D Array : ");
        display(new int[][] {
                { 1, 2 },
                { 3, 4, 5 },
                { 6 },
        });
    }

    static void display(int[][] arr) {
        for (int[] row : arr) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
