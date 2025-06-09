package Array_and_String;
import java.util.*;
//Find if there exists a pair in a sorted array that sums to a target.
class PairSumTarget{
    public boolean target(int[] n,int t){
        int sum=0;
        int start=0;
        int end=n.length-1;
        while(start<end){
            sum = n[start] + n[end];
            if(sum==t){
                return true;
            }
            else if(sum>t){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
}
public class day_9_PairSumExist_SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements you want to store in an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+ i+": " );
            int num = sc.nextInt();
            arr[i] = num;
        }
        Arrays.sort(arr);
        System.out.print("Enter Target: ");
        int t =sc.nextInt();
        PairSumTarget obj = new PairSumTarget();
        System.out.println(obj.target(arr, t));
        sc.close();
    }
}
