package recursion_and_backtracking;
import java.util.Scanner;

class odd_even{
    public void oddfn(int n){
        if (n<=10){
            System.out.print(n+1+" ");
            n++;
            evenfn(n);
        }
    }
    public void evenfn(int n){
        if(n<=10){
            System.out.print(n-1 +" ");
            n++;
            oddfn(n);
        }
    }
}


public class day_18_indirect_recursion_example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int s = sc.nextInt();
        System.out.println();
        odd_even num = new odd_even();
        if(s%2==0){
            num.evenfn(s);
        }
        else{
            num.oddfn(s);
        }
        sc.close();
    }
}
