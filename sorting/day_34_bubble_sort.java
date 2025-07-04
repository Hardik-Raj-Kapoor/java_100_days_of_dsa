package sorting;

import java.util.Scanner;

class bubble_sort{
    public int[] sort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]) swap(arr,j, j+1);
                else continue;
            }
        }
        return arr;
    }
    public void swap(int arr[],int i,int j){
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }
    public void bubble_print(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}


public class day_34_bubble_sort {
    public static void main(String[] args) {
        bubble_sort bubble = new bubble_sort();
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
        bubble.sort(arr);
        System.out.print("Sorted Array: ");
        bubble.bubble_print(arr);
        sc.close();
    }
}
