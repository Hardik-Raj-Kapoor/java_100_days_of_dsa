package hashmap_hashset;

import java.util.*;

class top_k_frequency_elements{
    public int[] k_frequency_elements(int[] arr,int k){
        // Step 1: count frequencies
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: arr) map.put(num,map.getOrDefault(num, 0)+1);
        
        // Step 2: use min-heap of size k
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());

        for(Map.Entry<Integer, Integer>entry : map.entrySet()){
            heap.offer(entry);
            if (heap.size() > k) {
                heap.poll();  // remove the least frequent element
            }
        }

        // Step 3: extract elements from heap
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll().getKey();
        }

        return result;
    }
}


public class day_39_top_k_frequency_elements {
    public static void main(String[] args) {
        top_k_frequency_elements freq = new top_k_frequency_elements();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+i+" : ");
            int enter = sc.nextInt();
            arr[i] = enter;
        }

        System.out.print("\nYour array: ");
        for(int i: arr){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.print("Enter Frequency: ");
        int k = sc.nextInt();
        System.out.println(Arrays.toString(freq.k_frequency_elements(arr,k)));
        sc.close();
    }    
}
