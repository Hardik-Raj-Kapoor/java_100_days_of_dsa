package Dynamic_programming;

public class day_96_Minimum_Difference_Partition {
    public static int minDifference(int[] arr,int n){
        int total = 0;

        for(int i=0;i<n;i++){
            total+=arr[i];
        }

        int target = total/2;

        boolean[][] dp = new boolean[n+1][target+1];

        for(int i=0;i<=n;i++){
            dp[i][0]= true;
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

        int best = 0;
        for(int j=target;j>=0;j--){
            if(dp[n][j]){
                best = j;
                break;
            }
        }
        return total - 2*best;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 11, 5};
        int n = arr.length;

        int diff = minDifference(arr, n);
        System.out.println("Minimum difference between two subsets = " + diff);
    }
}
