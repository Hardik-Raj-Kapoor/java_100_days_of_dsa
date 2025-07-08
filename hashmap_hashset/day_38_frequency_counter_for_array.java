package hashmap_hashset;
import java.util.Scanner;
import java.util.HashMap;

class array_freq_count{
    public void freq_count(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i: arr){
            freq.put(i,freq.getOrDefault(i,0 )+1);
        }

        for(int i: freq.keySet()){
            System.out.println(i +" -> "+ freq.get(i));
        }
    }
}

public class day_38_frequency_counter_for_array {
    public static void main(String[] args) {
        array_freq_count freq = new array_freq_count();
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
        freq.freq_count(arr);
        sc.close();
        
}
}
