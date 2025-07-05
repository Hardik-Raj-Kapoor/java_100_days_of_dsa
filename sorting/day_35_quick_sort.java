package sorting;

import java.util.Scanner;

class quick_sort{
    public void quick(int[] arr,int low,int high){
        if (low<high){
            int pivotIndex = sort(arr,low,high);
            quick(arr, low, pivotIndex-1);
            quick(arr, pivotIndex+1, high);
        }
    }

    public int sort(int[] arr,int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i=i+1;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class day_35_quick_sort {
    public static void main(String[] args) {
        quick_sort quick = new quick_sort();
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
        quick.quick(arr, 0, arr.length-1);
        System.out.println("Sorted array: ");
        for(int i: arr)System.out.print(i+ " ");
        sc.close();
    }
}
