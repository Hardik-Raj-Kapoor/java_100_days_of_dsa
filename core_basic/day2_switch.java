import java.util.*;
public class day2_switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day number: ");
        int num1 = sc.nextInt();
        switch (num1) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("sunday");
                break;
            default:
                System.out.print("Invalid");
                break;
            }
            sc.close();
    }
}
