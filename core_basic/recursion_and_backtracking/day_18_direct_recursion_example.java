package recursion_and_backtracking;
import java.util.Scanner;
abstract class dir_rec{
    public abstract void countdown(int n);
}

class new_dir_rec extends dir_rec{
    public void countdown(int n){
        if (n == 0) {
            System.out.println("Blast off!");
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }

}
public class day_18_direct_recursion_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Count Down Number: ");
        int s = sc.nextInt();
        new_dir_rec count = new new_dir_rec();
        count.countdown(s);
        sc.close();
    }
}
