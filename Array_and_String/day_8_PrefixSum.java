package Array_and_String;
import java.util.*;

class PrefixSum{
    int sum=0;
    int[] prefix;
    public void sum(int[] arr){
        prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        System.out.println("\nPrefix sum array:");
        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i] + " ");
        }
        
    }
    public int sub(int[] prefix, int l, int r) {
        if (l == 0)
            return prefix[r];
        else
            return prefix[r] - prefix[l - 1];
    }


}


public class day_8_PrefixSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of elements you want to store in an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+ i+": " );
            int num = sc.nextInt();
            arr[i] = num;
        }
        System.out.println("Elements in your array: ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        PrefixSum obj = new PrefixSum();
        obj.sum(arr);
        System.out.println(" ");
        System.out.println("Enter for subarray prefix sum: ");
        System.out.print("From: ");
        int l=sc.nextInt();
        System.out.print("To:");
        int r=sc.nextInt();
        System.out.println(obj.sub(obj.prefix,l,r));
        sc.close();
    }
}
