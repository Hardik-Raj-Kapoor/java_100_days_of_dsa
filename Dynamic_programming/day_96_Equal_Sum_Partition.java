package Dynamic_programming;

public class day_96_Equal_Sum_Partition {
    public static boolean canPartition(int[] arr, int n){
        int total = 0;
        for(int i=0;i<n;i++){
            total +=arr[i];
        }

        if(total%2 !=0) return false;

        int target = total/2;
        boolean[][] dp = new boolean[n+1][target+1];

        for(int i = 0;i<=n;i++){
            dp[i][0] = true;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][target];
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 5};
        int n = arr.length;

        if (canPartition(arr, n)) System.out.println("Can be partitioned into two subsets with equal sum.");
        else System.out.println("Cannot be partitioned into two subsets with equal sum.");
    }
}
