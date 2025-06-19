package Matrix_operations;
import java.util.Scanner;


public class day_19_matrix_creation {
    public static void main(String[] args) {
        //fixed 
        int[][] fixed = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};

                         
        for(int i = 0; i<fixed.length;i++){
            for(int j=0;j<fixed[i].length;j++){
                System.out.print(fixed[i][j]+" ");
            }
            System.out.println();
        }
        
        //custom Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int c  = sc.nextInt();
        int[][] mat = new int[r][c];
        for(int i = 0; i<r;i++){
            for(int j=0;j<c;j++){
                    System.out.print("Enter element at "+"["+i+","+j+"]: ");
                    int element = sc.nextInt();
                    mat[i][j] = element;
            }
        }

        //printing the value we input
        for(int i = 0; i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    
    }    
}
