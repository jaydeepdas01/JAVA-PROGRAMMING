public class Method2DArray {
    public static void main(String[] args) {
         int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 6, 7, 8 },
        };

        //pasing 2D array in method.
        display2D(arr);
    }

    static void display2D(int[][] arr){
        for(int[] row : arr){
            for ( int i : row){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
