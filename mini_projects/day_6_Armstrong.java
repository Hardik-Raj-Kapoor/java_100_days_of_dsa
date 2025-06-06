import java.util.*;
import java.lang.Math;
class Armstrong{
    public int checkArm(int n){
        String new_num = String.valueOf(n);
        int num1 = n;
        int val = 0;
        int cal = 0;
        for(int i = 0; i<=new_num.length()-1;i++){
            int temp = num1%10;
            val = (int)Math.pow(temp, new_num.length());
            cal += val;
            num1 = num1/10;
        }
        if (cal == n){
            System.out.println(cal+": Armstrong");
        }
        else{
            System.out.println(cal+": Not Armstrong");
        }
        return 0;
    }
}

public class day_6_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("/*Armstrong Number Checker*/");
        System.out.print("Enter Numeric Value: ");
        int num = sc.nextInt();
        Armstrong obj = new Armstrong();
        obj.checkArm(num);
        sc.close();
    }
}
