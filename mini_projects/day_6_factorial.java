import java.util.*;
class fact{
    public int facto(int n){
        int n1 =n;
        for(int i = n1-1;i>=1;i--){
            n1 *=i;
        }
        System.out.print("Factorial of "+n +" is: ");
        return n1;
    }
}

public class day_6_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("/*Factorial*/");
        System.out.print("Enter Numeric Value: ");
        int num = sc.nextInt();
        fact ob = new fact();
        System.out.println(ob.facto(num));
        sc.close();
    }
}