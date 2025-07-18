import java.util.Scanner;

class printing_numbers{
    public void printDescending(int n) {
        if (n == 0)
            return;
        System.out.print(n+" ");       // Action first
        printDescending(n - 1);      // Tail call
    }
    public void printAscending(int n) {
        if (n == 0)
            return;
        printAscending(n - 1);       // Not a tail call
        System.out.print(n+" ");       // Action after recursion
    }
}


public class day_18_tail_nontail_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int s = sc.nextInt();
        System.out.print("Choose 1 for ascending and 2 for descending: ");
        int c = sc.nextInt();
        printing_numbers obj =new printing_numbers();
    
        if(c==1){
            obj.printAscending(s);
        }
        else{
            obj.printDescending(s);
        }
        sc.close();
    
    }    
}
