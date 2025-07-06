package sorting;
import java.util.Scanner;

class count_sort{
    public void sort(int[] arr) {
        //maximum element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //count array
        int[] count = new int[max + 1]; 
        int[] output = new int[arr.length];

        //Storing the count of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //Storing cumulative counts
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        //Placing elements into output array
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        //Copy the output to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
}

public class day_36_count_sort {
    public static void main(String[] args) {
        count_sort count = new count_sort();
        //int[] arr = {4, 2, 2, 8, 3, 3, 1};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] arr= new int[n];
        
        for(int i = 0;i<n;i++){
            System.out.print("Enter element "+ i+": ");
            int store = sc.nextInt();
            arr[i] = store;
        }
        System.out.println();
        System.out.print("Initial Array: ");
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
        count.sort(arr);
        System.out.println("Sorted array: ");
        for(int i: arr)System.out.print(i+ " ");
        sc.close();
    }
}
