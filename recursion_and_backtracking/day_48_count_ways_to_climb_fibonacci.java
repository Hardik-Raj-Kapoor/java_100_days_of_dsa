import java.util.Scanner;
class count{
    public int countWays(int n) {
        if (n == 0 || n == 1) return 1; // base cases
        return countWays(n - 1) + countWays(n - 2);
    }
}

public class day_48_count_ways_to_climb_fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        count obj =new count();
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.println(obj.countWays(n));
        sc.close();
    }   
}
