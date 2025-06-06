import java.util.*;
class fib{
    public int fibo(int n){
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1);
        System.out.println(num2);
        for(int i=1;i<=n-2;i++){
            int num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
        return 0;
    }
}


public class day_6_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("/*Fibonacci Series*/");
        System.out.print("Enter Numeric Value: ");
        int num = sc.nextInt();
        fib obj = new fib();
        obj.fibo(num);
        sc.close();
    }
}
