package Dynamic_programming;

import java.util.Scanner;

public class day_94_Matrix_Path {
    public static int myMin(int a, int b){
        if(a<b)return a;
        return b;
    }

    public static int minPathSum(int[][] matrix, int m, int n){
        int[][] dp = new int[m][n];
        dp[0][0] = matrix[0][0];

        for(int j = 1;j<n;j++) dp[0][j] = dp[0][j-1] + matrix[0][j];

        for(int i = 1;i<m;i++) dp[i][0] = dp[i-1][0] + matrix[i][0];
    
        for(int i = 1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = matrix[i][j] + myMin(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int result = minPathSum(matrix, m, n);
        System.out.println("Minimum Path Sum = " + result);

        sc.close();
    }
}
