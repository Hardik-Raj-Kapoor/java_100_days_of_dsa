import java.util.*;
import java.lang.Math;

class calc{
    public double add(double n1, double n2){
        System.out.print("addition of "+n1+" and "+n2+ " is: " );
        return n1+n2;
    }
    public double sub(double n1, double n2){
        System.out.print("Subtraction of "+n1+" and "+n2+ " is: " );
        return n1-n2;
    }
    public double mul(double n1, double n2){
        System.out.print("Multiple of "+n1+" and "+n2+ " is: " );
        return n1*n2;
    }
    public double div(double n1, double n2){
        System.out.print("division of "+n1+" by "+n2+ " is: " );
        return n1/n2;
    }
    public double rem(double n1, double n2){
        System.out.print("remaider of "+n1+" by "+n2+ " is: " );
        return n1%n2;
    }
    public double power(double n1, double n2){
        System.out.print(n1+" to the power "+n2+ " is: " );
        return Math.pow(n1,n2);
    }
}

public class day_6_SimpleCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();
        System.out.println("Operator(+): for addition\nOperator(-): for Subtraction\nOperator(/): for division");
        System.out.println("Operator(%): for remainder\nOperator(^): for power");
        System.out.print("Enter Operator: ");
        String op = sc.next();
        calc obj = new calc();
        if(op.equals("+")){
            System.out.println(obj.add(num1,num2));
        }
        else if(op.equals("-")){
            System.out.println(obj.sub(num1,num2));
        }
        else if(op.equals("*")){
            System.out.println(obj.mul(num1,num2));
         }
        else if(op.equals("/")){
            System.out.println(obj.div(num1,num2));
        }
        else if(op.equals("%")){
            System.out.println(obj.rem(num1,num2));
        }
        else if(op.equals("^")){
            System.out.println(obj.power(num1,num2));
        }
        else{
            System.out.println("Enter Valid Operator");
        }
        sc.close();
    }
}
