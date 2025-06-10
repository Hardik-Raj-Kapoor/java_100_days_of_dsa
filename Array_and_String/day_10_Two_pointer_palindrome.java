package Array_and_String;
import java.util.*;

class Checker{
    public String checkPal(String s){
    int left = 0; int right=s.length() - 1;
    while (left < right){

        if(s.charAt(right) != s.charAt(left)){

            return "false";
        }
        else{
            left += 1;
            right -= 1;
        return "True";
        }
    }
    return s;
    }
}


public class day_10_Two_pointer_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("/*Palindrome Checker*/");
        System.out.println("Enter the Number or String: ");
        String str = sc.next();
        Checker obj = new Checker();
        System.out.println(obj.checkPal(str));
        sc.close();
    }
}
