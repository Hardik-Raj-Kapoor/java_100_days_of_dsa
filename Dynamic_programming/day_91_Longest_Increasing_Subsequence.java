package Dynamic_programming;

public class day_91_Longest_Increasing_Subsequence {
    public static int LIS_DP(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];

        for(int i = 0;i<n;i++)  dp[i] = 1;

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && dp[i]<dp[j]+1){
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int lis = 1;
        for(int i = 0;i<n;i++){
            lis = Math.max(lis,dp[i]);
        }
        return lis;
    }
    public static void main(String[] args){
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
        System.out.println("Length of LIS is " + LIS_DP(arr));
    }
}
