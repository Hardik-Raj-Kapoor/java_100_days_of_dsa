package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class day_49_GenerateBinaryNumbers {
    public static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String s = q.remove();
            System.out.print(s + " ");
            q.add(s + "0");
            q.add(s + "1");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        generateBinary(n);
    }
}

