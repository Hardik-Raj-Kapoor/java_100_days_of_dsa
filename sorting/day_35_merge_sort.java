package sorting;
import java.util.Scanner;
class merge_sort{
    public void sort(int[] arr, int left, int right){
        if(left<right){
            int mid = (left+right)/2;
            sort(arr,left,mid);
            sort(arr, mid+1, right);
            merge(arr,left,mid,right);
        }
    }

    public void merge(int[] arr,int left, int mid, int right){
        int n1 = mid -left+1;
        int n2 = right-mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0;i<n1;i++) L[i] = arr[left+i];

        for(int j=0;j<n2;j++) R[j] = arr[mid+1+j];

        int i=0, j = 0,k =left;
        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                arr[k] = L[i];
                i=i+1;
            }else{
                arr[k] = R[j];
                j=j+1;
            }
            k=k+1;
        }
        while(i<n1){
            arr[k] = L[i];
            i=i+1;
            k=k+1;
        }
        
        while(j<n2){
            arr[k] = R[j];
            j=j+1;
            k=k+1;
        }
    }
    public void merge_print(int[] arr){
        for(int i: arr)System.out.print(i+" ");
        System.out.println();
    }
}


public class day_35_merge_sort {
    public static void main(String[] args) {
        merge_sort merge = new merge_sort();
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
        merge.sort(arr,0,arr.length-1);
        System.out.print("Sorted Array: ");
        merge.merge_print(arr);
        sc.close();
    }
}
