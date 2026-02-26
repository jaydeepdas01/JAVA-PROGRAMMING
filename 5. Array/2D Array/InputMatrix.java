import java.util.Scanner;

public class InputMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of row : ");
        int row = sc.nextInt();
        System.out.print("Enter the size of col : ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        // taking input from user.
        System.out.println("Enter matrix element : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Enter a[%d][%d] element : ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        //now print 2d matrix
        System.out.println("Printing all element in " + row + "x" + col + " matrix form.");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
