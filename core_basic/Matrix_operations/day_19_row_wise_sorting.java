package Matrix_operations;

import java.util.Arrays;
import java.util.Scanner;

public class day_19_row_wise_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of Columns: ");
        int Columns = sc.nextInt();
        int[][] matrix = new int[rows][Columns];

        for(int i = 0;i<rows;i++){
            for(int j=0;j<Columns;j++){
                System.out.print("Enter element at "+"["+i+","+j+"]: ");
                    int element = sc.nextInt();
                    matrix[i][j] = element;
            }
        }

        System.out.println("Your Matrix: ");
        for(int i = 0;i<rows;i++){
            for(int j=0;j<Columns;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]); // sorts each row
        }

        System.out.println("Row-wise Sorted:");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
        sc.close();
    }
}
