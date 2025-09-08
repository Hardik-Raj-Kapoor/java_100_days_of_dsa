package Greedy_Algorithms;

public class day_100_coin_change {
    public static void sortDescending(int[] coins){
        int n = coins.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (coins[j] < coins[j + 1]){
                    int temp = coins[j];
                    coins[j] = coins[j + 1];
                    coins[j + 1] = temp;
                }
            }
        }
    }

    static void coinChange(int[] coins, int amount){
        sortDescending(coins);

        System.out.print("Coins used: ");
        for (int i = 0; i < coins.length; i++){
            while (amount >= coins[i]){
                amount -= coins[i];
                System.out.print(coins[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] coins = {1, 2, 5, 10, 20, 50, 100};
        int amount = 93;
        coinChange(coins, amount);
    }
}
