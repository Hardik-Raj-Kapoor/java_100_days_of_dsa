package recursion_and_backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class sum_of_subset{
    public void subset_sum(int index, int[] num, int target, List<Integer> current, int current_sum,List<List<Integer>> result){
        // If sum matches the target, save it
        if(current_sum == target){
            result.add(new ArrayList<>(current));
            return;
        }

        // If sum exceeds the target or end of list, stop
        if(current_sum>target || index==num.length){
            return;
        }

        // Include current number
        current.add(num[index]);
        subset_sum(index + 1, num, target, current, current_sum + num[index], result);

        // Backtrack — remove the number and try without it
        current.remove(current.size()-1);
        subset_sum(index+1, num, target, current, current_sum, result);
        

        }
    }


public class day_20_sum_of_subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements you want in an array: ");
        int n = sc.nextInt();
        //araay creation
        int[] num = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter Elements: ");
            int temp = sc.nextInt();
            num[i] = temp;
        }
        
        
        //array printing
        System.out.print("Elements: ");
        for(int i = 0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.print("Enter Targer Value: ");
        int target = sc.nextInt();
        //result = list of list
        List<List<Integer>> result = new ArrayList<>();

        sum_of_subset obj = new sum_of_subset();
        obj.subset_sum(0, num, target,new ArrayList<>(), 0, result);

        for(List<Integer> subset: result){
            System.out.println(subset);
        }

        sc.close();
    }
}
