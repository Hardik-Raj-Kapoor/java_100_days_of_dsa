import java.util.*;
class Body_Mass_Index{
    public double bmicalc(double W, double H){
        double res = W/(H*H);
        return res;
    }
}

public class day_7_BMI_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Weight(in kg): ");
        double Weight = sc.nextDouble();
        System.out.println("Enter Your Height(in m): ");
        double Height = sc.nextDouble();
        Body_Mass_Index obj = new Body_Mass_Index();
        if (Weight>0 && Height>0){
            System.out.println(obj.bmicalc(Weight,Height));
            if(obj.bmicalc(Weight,Height)<18.5){
                System.out.println("You are Underweight");
            }
            else if(obj.bmicalc(Weight,Height)>=18.5 && obj.bmicalc(Weight,Height)<24.9){
                System.out.println("You have Normal weight");
            }
            else if(obj.bmicalc(Weight,Height)>25 && obj.bmicalc(Weight,Height)<29.9){
                System.out.println("You are Overweight");
            }
            else if(obj.bmicalc(Weight,Height)>30){
                System.out.println("You are Obese");
            }
            else{
                System.out.println("Enter Valid Height and Weight");
            }
        }
        else{
            System.out.println("Enter Valid Height and Weight");
        }
        sc.close();
    }
}
