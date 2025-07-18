// goal is to find digit sum until you get single digit 
import java.util.Scanner;

class digit_sum{
    public int sumDigits(int n) {
        if (n < 10) return n;
    
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
    
        return sumDigits(sum);  // recursive call
    }
}

public class day_48_DigitSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        digit_sum obj = new digit_sum();
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.println(obj.sumDigits(num));
        sc.close();
    }
}
