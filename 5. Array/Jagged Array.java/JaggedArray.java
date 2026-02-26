public class JaggedArray{
    public static void main(String[] args){
        // A jagged Array is 2D array with diffrent size of coloum . 
        int[][] arr ={
            {1,2,3},
            {4,5},
            {6},

        };

    System.out.println("Printing Jagged Array : ");
        for(int[] row : arr){
            for(int i : row){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}