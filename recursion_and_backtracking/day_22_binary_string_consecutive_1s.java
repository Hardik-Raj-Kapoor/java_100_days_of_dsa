import java.util.Scanner;

class  binary_string_2{
    public void string_gen_binary(int n,int last, String current){
        if(current.length() == n){
            System.out.println(current);
            return;
        }

        //add '0' always
        string_gen_binary(n,0,current+"0");

        //add '1' only if previous was zero
        if(last ==0){
            string_gen_binary(n,1, current+"1");
        }
    }
}

public class day_22_binary_string_consecutive_1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Binary String: ");
        int n = sc.nextInt();
        binary_string_2 obj = new binary_string_2();
        obj.string_gen_binary(n,0,"");
        sc.close();
    }
}
