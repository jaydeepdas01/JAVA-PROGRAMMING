
public class Return2DArray {
    public static void main(String[] args) {
        System.out.println("First method 2D array : ");
        display2D(get2DArray());
        System.out.println("Second method 2D array : ");
        display2D(get2DArray2());
       
    }

    // first method to return 2D array.
    static int[][] get2DArray() {
        int[][] arr = {
                { 1, 2 },
                { 3, 4 },
        };

        return arr;
    }

    // 2nd method to retrun 2D array
    static int[][] get2DArray2() {
        return new int[][] {
                { 4, 5 },
                { 6, 7 },
        };
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
