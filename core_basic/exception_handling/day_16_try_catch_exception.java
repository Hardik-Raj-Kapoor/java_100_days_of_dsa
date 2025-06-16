package exception_handling;
import java.util.*;
public class day_16_try_catch_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int j = sc.nextInt();
        System.out.print("Enter number: ");
        int i = sc.nextInt();
        try{
            j=j/i;
        }catch(Exception e){//executed only in case of exception
            if(i==0){

                System.out.println("Something went wrong.....");
            }
        }
        System.out.println("Here is your answer");
        sc.close();
    }
}
