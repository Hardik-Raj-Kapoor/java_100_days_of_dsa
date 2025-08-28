package Dynamic_programming;

public class day_89_0_1_knapsack_recursive{
    public static int knapsack(int W, int[] wt, int[] val,int n){
        if(n == 0 || W == 0) return 0;

        if(wt[n-1]>W) return knapsack(W, wt, val, n-1);

        else{
            int include = val[n-1] + knapsack(W - wt[n-1], wt, val, n-1);
            int exclude = knapsack(W, wt, val, n-1);
            return Math.max(include,exclude);
        }
    }

    public static void main(String[] args){
        int[] val = {60,100,120};
        int[] wt = {10,20,30};

        int W = 50;
        int n = val.length;

        System.out.println("Maximum Value(Recursive): "+ knapsack(W, wt, val, n));
    }
}
