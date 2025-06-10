package Array_and_String;
import java.util.*;

class Zero{
    public int move(int[] n){
        int last_non_zero = 0;
        for(int i=0;i<n.length;i++){
            if(n[i] !=0){
                n[last_non_zero] = n[i];
                last_non_zero++;
            }
        }
        for(int i=last_non_zero;i<n.length;i++){
            n[i] = 0;
        }
        System.out.print("Elements in an array: ");
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        return 0;
    }
}

public class day_10_moveZero {
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
        Zero obj = new Zero();
        obj.move(arr);
    }
}
