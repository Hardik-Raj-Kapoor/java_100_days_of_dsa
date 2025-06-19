package Matrix_operations;
import java.util.Scanner;

public class day_19_matrix_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of Columns: ");
        int Columns = sc.nextInt();
        int[][] matrixA = new int[rows][Columns];
        int[][] matrixB = new int[rows][Columns];
    
        for(int i = 0;i<rows;i++){
            for(int j=0;j<Columns;j++){
                System.out.print("Matrix A: Enter element at "+"["+i+","+j+"]: ");
                    int element = sc.nextInt();
                    matrixA[i][j] = element;
            }
        }

        for(int i = 0;i<rows;i++){
            for(int j=0;j<Columns;j++){
                System.out.print("Matrix B: Enter element at "+"["+i+","+j+"]: ");
                    int element = sc.nextInt();
                    matrixB[i][j] = element;
            }
        }

        System.out.println("Your Matrix A: ");
        for(int i = 0;i<rows;i++){
            for(int j=0;j<Columns;j++){
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Your Matrix B: ");
        for(int i = 0;i<rows;i++){
            for(int j=0;j<Columns;j++){
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
        int[][] result = new int[rows][Columns];
        System.out.println("Muultiplication: ");
        for(int i = 0;i<rows;i++){
            for(int j=0;j<Columns;j++){
                for(int k=0;k<Columns;k++){
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
        }
    }
        
        for(int i = 0;i<rows;i++){
            for(int j=0;j<Columns;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        


        sc.close();
    }
}
