public class AddTwoMatrix {
    public static void main(String[] args) {

        int[][] matrix1 = {
                { 2, 2, 2 },
                { 3, 3, 3 },
                { 4, 4, 4 },
                             };
        int[][] matrix2 = {
                { 2, 2, 2 },
                { 3, 3, 3 },
                { 4, 4, 4 },
                             };

        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] matrix3 = new int[row][col];

        
        for(int i = 0; i<matrix1.length;i++){
            for(int j = 0; j < matrix1[i].length;j++){
                matrix3[i][j] =  matrix1[i][j] + matrix2[i][j];
            }
        }

         for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}

