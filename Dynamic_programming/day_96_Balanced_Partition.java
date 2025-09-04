package Dynamic_programming;

public class day_96_Balanced_Partition {
    public static int balancedPartition(int[] arr,int n){
        int total = 0;
        for(int i=0;i<n;i++){
            total += arr[i];
        }
        int half_size = n/2;
        int target_sum = total/2;
        
        boolean[][][] dp = new boolean[n+1][half_size+1][target_sum+1];

        for(int i=0;i<=n;i++){
            dp[i][0][0] = true;
        }

        for(int i=1;i<=n;i++){
            for(int j=0;j<=half_size;j++){
                for(int k=0;k<=target_sum;k++){
                    dp[i][j][k]=dp[i-1][j][k];
                    if(j>0 && k>=arr[i-1]){
                        if(dp[i-1][j-1][k-arr[i-1]]){
                            dp[i][j][k] =  true;
                        }
                    }
                }
            }
        }
        int best = 0;
        for(int k = target_sum;k>=0;k--){
            if(dp[n][half_size][k]){
                best = k;
                break;
            }
        }
    
        int other = total - best;
        return Math.abs(other - best);
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 11, 5};
        int n = arr.length;

        int minDiff = balancedPartition(arr, n);
        System.out.println("Minimum difference with balanced partitioning = " + minDiff);
    }
}
