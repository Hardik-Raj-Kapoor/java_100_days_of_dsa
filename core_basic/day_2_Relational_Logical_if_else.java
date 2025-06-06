import java.util.*;
public class day_2_Relational_Logical_if_else {
    public static void main(String args[]){
        //Relational Op: <, >, ==, !=, <=,>=
        //Logical: &&, ||, !
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();
        //boolean res = num1 >= num2;
        //boolean res = num1 <= num2;
        //boolean res = num1 != num2;
        boolean res = num1 == num2;
        System.out.println(res);
        System.out.print("Enter First number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b = sc.nextInt();
        //boolean res1 = num1 > num2 && a>b;
        boolean res1 = num1 > num2 || a>b;
        System.out.println(!res1);
        System.out.println(res1);
        String ter = a==b?"a=b":"a!=b";
        if(num1>num2){
        System.out.println(num1+">"+num2);
        }
        else if(num1<num2){
        System.out.println(num1+"<"+num2 );
        }
        else{
        System.out.println("Equal "+ ter);
        }
        sc.close();
    }
}