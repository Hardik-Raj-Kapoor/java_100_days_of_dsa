package Matrix_operations;

import java.util.Scanner;

public class day_19_spiral_matrix {
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


        int top = 0, bottom = rows-1, left = 0, right = Columns-1;

        System.out.println("Spiral Order:");
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                System.out.print(matrix[top][i] + " ");
            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(matrix[i][right] + " ");
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(matrix[i][left] + " ");
                left++;
            }
        }

        sc.close();
    }
}
