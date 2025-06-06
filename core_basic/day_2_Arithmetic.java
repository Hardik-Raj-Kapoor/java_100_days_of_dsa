import java.util.*;
public class day_2_Arithmetic {
    public static void main(String args[]){
        //Arithmetic Op
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter First number: ");
        int num2 = sc.nextInt();
        System.out.println("Add: "+(num1+num2));
        System.out.println("Sub: " + (num1-num2));
        System.out.println("Mul: "+(num1*num2));
        System.out.println("Div: "+(num1/num2));
        System.out.println("Rem: "+(num1%num2));
        num1 +=2;
        System.out.println("new num after add 2: "+num1);
        num1 -=2;
        System.out.println("new num after sub 2: "+num1);
        num1 *=2;
        System.out.println("new num after mul 2: "+num1);
        num1 /=2;
        System.out.println("new num after div by 2: "+num1);
        num1++; //post increment
        ++num1; // pre increment
        num1--; // post decrement
        --num1; // pre decrement
        sc.close();
    }
}
