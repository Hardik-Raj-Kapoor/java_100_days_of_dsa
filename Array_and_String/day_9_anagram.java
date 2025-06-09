package Array_and_String;
import java.util.*;

class Anagram{
    public boolean check_anagram(String str1,String str2){
        char[] a =  str1.toCharArray();
        char[] b =  str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);


    }
}
public class day_9_anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("/*Check Anagram*/");
        System.out.print("Enter String 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter String 2: ");
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
        }
        else{
            Anagram obj = new Anagram();
            System.out.println(obj.check_anagram(str1,str2));
        }
        sc.close();
    }
}
