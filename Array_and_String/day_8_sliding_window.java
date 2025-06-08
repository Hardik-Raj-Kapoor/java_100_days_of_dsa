package Array_and_String;
import java.util.*;

    class S_W{
        Scanner sc= new Scanner(System.in);
        int sum = 0;
        public int window(int[] n){
            System.out.print("Enter Size of window: ");
            int k=sc.nextInt();
            if (k > n.length || k <= 0) {
                System.out.println("Invalid window size!");
                return -1;
            }
            for(int i =0;i<k;i++){
                sum += n[i];
            }
            int maxsum=sum;
            for (int i = k; i < n.length; i++) {
            sum += n[i] - n[i - k];  // Slide the window
            maxsum = Math.max(maxsum, sum);
            }
            System.out.println(maxsum);
        return 0;
        }
}

public class day_8_sliding_window {
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
        System.out.println();
        System.out.println("Sliding Window: ");
        S_W obj = new S_W();
        obj.window(arr);
        sc.close();
    }
}
