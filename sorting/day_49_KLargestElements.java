package sorting;

import java.util.*;

public class day_49_KLargestElements {
    
    public static List<Integer> findKLargest(int[] arr, int k) {
        // Min-heap to store k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest of the k+1 elements
            }
        }

        List<Integer> result = new ArrayList<>(minHeap);
        // Optional: To print in descending order
        Collections.sort(result, Collections.reverseOrder());
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        
        List<Integer> topK = findKLargest(arr, k);
        System.out.println("Top " + k + " largest elements: " + topK);
    }
}
