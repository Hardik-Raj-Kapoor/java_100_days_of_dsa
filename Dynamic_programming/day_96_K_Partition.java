package Dynamic_programming;

public class day_96_K_Partition {
    public static boolean canKPartition(int[] arr,int n,int k){
        int total = 0;
        for(int i=0;i<n;i++){
            total += arr[i];
        }

        if(total %k != 0) return false;
        int target = total/k;
        boolean[] visited = new boolean[n];
        
        return backtrack(arr,visited,k,0,0,target,0);
    }

    private static boolean backtrack(int[] arr, boolean[] visited,int k,int cur_sum,int start, int target, int count){
        if(k==1)return true;
        if(cur_sum == target && count >0){
            return backtrack(arr, visited, k-1, 0, 0, target, 0);
        }

        for(int i = start;i<arr.length;i++){
            if(!visited[i] && cur_sum+arr[i]<=target){
                visited[i] = true;
                if(backtrack(arr, visited, k, cur_sum +arr[i], i+1, target, count+1)) return true;
                visited[i] = false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 5, 6};
        int n = arr.length;
        int k = 3;

        if (canKPartition(arr, n, k)) System.out.println("Can be partitioned into " + k + " subsets with equal sum.");
        else System.out.println("Cannot be partitioned into " + k + " subsets with equal sum.");
    }
}
