package Queue;

import java.util.*;

public class day_49_InterLeaveQueue {
    public static void interleave(Queue<Integer> q) {
        int n = q.size() / 2;
        Queue<Integer> firstHalf = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 6; i++) q.add(i);

        System.out.println("Before: " + q);
        interleave(q);
        System.out.println("After: " + q);
    }
}
