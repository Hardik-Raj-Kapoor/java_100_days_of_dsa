package Array_and_String;
import java.util.*;

class kadane{
    public int kad_algo(int[] num){
        int current_sum = num[0];
        int global_sum = num[0];

        for (int i = 1; i < num.length; i++) {
            current_sum = Math.max(num[i], current_sum + num[i]);
            global_sum = Math.max(global_sum, current_sum);
        }

        return global_sum;
    }


    }

public class day_10_kadanes_algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+i+": ");
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        System.out.print("Elements in an array: ");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
        kadane obj = new kadane();
        System.out.println("Maximum Sum of Subarray: "+obj.kad_algo(arr));
    }
}
