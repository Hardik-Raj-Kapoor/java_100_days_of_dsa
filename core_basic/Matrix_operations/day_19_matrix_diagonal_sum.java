package Matrix_operations;

import java.util.Scanner;

public class day_19_matrix_diagonal_sum {
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

        System.out.print("Primary Diagonal Sum: ");
        int diag = 0;
        for(int i=0;i<matrix.length;i++){
            diag+=matrix[i][i];
        }
        System.out.println(diag);
        
        System.out.print("Secondary Diagonal Sum: ");
        int secdiag = 0;
        for(int i=0;i<matrix.length;i++){
            secdiag+=matrix[i][matrix.length-i-1];
        }
        System.out.println(secdiag);
        sc.close();
    }
}
