package Greedy_Algorithms;

class Item{
    int weight,value;
    Item(int w,int v){
        weight = w;
        value = v;
    }
}

public class day_100_Fractional_Knapsack {
    public static void sortByRatio(Item[] items){
        int n = items.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                double r1 = (double) items[j].value/items[j].weight;
                double r2 = (double) items[j+1].value/items[j+1].weight;
                if(r1<r2){
                    Item temp = items[j];
                    items[j] = items[j+1];
                    items[j+1] = temp;
                }
            }            
        }
    }

    public static double fractionalKnapsack(int W, Item[] items){
        sortByRatio(items);
        double totalValue = 0.0;
        int remainingCapacity = W;

        for(int i=0;i<items.length;i++){
            if(items[i].weight <=remainingCapacity){
                totalValue += items[i].value;
                remainingCapacity -=items[i].weight;
            }
            else{
                double fraction = (double)remainingCapacity/items[i].weight;
                totalValue += items[i].value*fraction;
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args){
        Item[] items = {
            new Item(10, 60),
            new Item(40, 40),
            new Item(20, 100),
            new Item(30, 120)
        };

        int W = 50;
        System.out.println("Maximum value in Knapsack = " + fractionalKnapsack(W, items));
    }

}
