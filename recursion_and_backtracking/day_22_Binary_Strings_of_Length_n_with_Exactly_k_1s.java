package recursion_and_backtracking;

import java.util.*;
class  binary_string_3{
    public void generate(int n, int k, String current, int onesCount) {
        if (current.length() == n) {
            if (onesCount == k) {
                System.out.println(current);
            }
            return;
        }

        // Add 0
        generate(n, k, current + "0", onesCount);

        // Add 1 if we haven't used up all k 1s
        if (onesCount < k) {
            generate(n, k, current + "1", onesCount + 1);
        }
    }
}

public class day_22_Binary_Strings_of_Length_n_with_Exactly_k_1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        int n = sc.nextInt();
        System.out.print("how many 1s you want? ");
        int k = sc.nextInt();
        binary_string_3 obj = new binary_string_3();
        obj.generate(n, k, "", 0);
        sc.close();
    }
}
