package recursion_and_backtracking;

import java.util.Scanner;

class  binary_string_1{
    public void string_gen_binary(int n,String current){
        if(current.length() == n){
            System.out.println(current);
            return;
        }

        //choose "0"
        string_gen_binary(n, current+"0");

        //choose "1"
        string_gen_binary(n, current+"1");
    }
}


public class day_22_binary_string_backtraking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Binary String: ");
        int n = sc.nextInt();
        binary_string_1 obj = new binary_string_1();
        obj.string_gen_binary(n,"");
        sc.close();
    }
}
