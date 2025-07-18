import java.util.Scanner;

class count_ways{
    public int countPaths(int n, String path) {
        if (n == 0) {
            System.out.println(path.trim()); // to avoid putting space after last char 
            return 1;
        }
        if (n < 0) return 0;
    
        int oneStep = 0; 
        int twoStep = 0;
    
        if (n - 1 >= 0) {
            oneStep = countPaths(n - 1, path + "1 ");
        }
        if (n - 2 >= 0) {
            twoStep = countPaths(n - 2, path + "2 ");
        }
    
        return oneStep + twoStep;
    }
}

public class day_48_count_ways_to_climb_stairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        count_ways obj = new count_ways();
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.println("Paths to climb " + n + " stairs:");
        int total = obj.countPaths(n, "");
        System.out.println("Total ways: " + total);
        sc.close();
    }
}

