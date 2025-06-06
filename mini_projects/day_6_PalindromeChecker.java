import java.util.*;

class Checker{
    String rev_s="";
    public String checkPal(String s){
        for(int i=s.length()-1;i>=0;i--){
            rev_s  += s.charAt(i);
            }
            System.out.println(rev_s);
            if(rev_s.equals(s)){
                return s + ": Palindrome";
            }
            else{
                return s + ": Not Palindrome";
            }
    }
}

public class day_6_PalindromeChecker {
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
