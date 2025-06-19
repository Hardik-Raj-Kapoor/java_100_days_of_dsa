package Matrix_operations;
import java.util.Scanner;
public class day_19_sum_of_elements_in_a_matrix {
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
        
        //Sum of all ements in created matrix
        int all_sum = 0;
        System.out.print("Sum of all ements in created matrix: ");
        for(int i = 0;i<rows;i++){
            for(int j=0;j<Columns;j++){
                all_sum += matrix[i][j];
            }
        }
        System.out.println(all_sum);        
        
        //Sum of rows in given matrix
        for(int i = 0;i<rows;i++){
            int row_sum = 0;
            for(int j=0;j<Columns;j++){
                row_sum+= matrix[i][j];
            }
            System.out.println("Sum of elements in "+i+ " row: "+row_sum);
        }

        //Sum of colums in given matrix
        for(int j=0;j<Columns;j++){
            int col_sum = 0;
            for(int i = 0;i<rows;i++){
                col_sum+= matrix[i][j];
            }
            System.out.println("Sum of elements in "+j+ " column: "+col_sum);
        }
        sc.close();
    }
}
