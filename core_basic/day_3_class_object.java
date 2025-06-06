import java.util.*;
public class day_3_class_object {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        addition plus = new addition();
        plus.add(num1,num2);
        sc.close();
    }
}

class addition{
    int add(int n1,int n2){
        int result = n1+n2;
        System.out.print(n1+" + " + n2 + " = " + result);
        return result;
    }
    int add(int n1,int n2,int n3){
        int result = n1+n2+n3;
        System.out.print(n1+" + " + n2 +" + " + n3+ " = " + result);
        return result;
    }
    double add(double n1,double n2,double n3){
        double result = n1+n2+n3;
        System.out.print(n1+" + " + n2 +" + " + n3+ " = " + result);
        return result;
    }
}