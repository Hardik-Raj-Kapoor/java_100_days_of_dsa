package Matrix_operations;

import java.util.Scanner;

public class day_19_transpose_matrix {
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

        System.out.println("Transpose of a matrix: ");
        for(int j=0;j<Columns;j++){
            for(int i = 0;i<rows;i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
