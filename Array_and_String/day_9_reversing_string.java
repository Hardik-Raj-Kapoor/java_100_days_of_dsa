package Array_and_String;
import java.util.*;
public class day_9_reversing_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("/*Reversing String*/");
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Reversed String: ");
        for(int i = str.length()-1;i>=0;i--){
            System.out.print(str.toLowerCase().charAt(i));
        }
        sc.close();
    }
}
