import java.util.*;

class c_f_k{
    public double ctof(double n){
        double F = (n * 9/5) + 32;
        return F;
    }
    public double ctok(double n){
        double K = n+ 273.15;
        return K;
    }
    public double ftoc(double n){
        double C = (n - 32) * 5/9;
        return C;
    }
    public double ftok(double n){
        double K = (n - 32) * 5/9 + 273.15 ;
        return K;
    }
    public double ktoc(double n){
        double C = n - 273.15;
        return C;
    }
    public double ktof(double n){
        double F = (n - 273.15) * 9/5 + 32 ;
        return F;
    }
}

public class day_7_temp_convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose: 1 for Celcius\n2 for Fahrenheit\n3 for Kelvin: ");
        int num1 = sc.nextInt();
        c_f_k obj = new c_f_k();
        if(num1 ==1){
            System.out.print("Enter Value(Celcius): ");
            double val = sc.nextDouble();
            System.out.println("For Celius to Fahrenheit coversion input F\nFor Celius to Kelvin conversion input K");
            System.out.print("Input(F or K): ");
            String C = sc.next();
            if(C.equals("F")){
                System.out.println(obj.ctof(val));
            }
            else if(C.equals("K")){
                System.out.println(obj.ctok(val));
            }
            else{
                System.out.println("Something Went Wrong......");
            }
        }

        else if(num1==2){
            System.out.print("Enter Value(Fahrenheit): ");
            double val = sc.nextDouble();
            System.out.println("For Fahrenheit to Celius coversion input C\nFor Fahrenheit to Kelvin conversion input K");
            System.out.print("Input(C or K): ");
            String F = sc.next();
            if(F.equals("C")){
                System.out.println(obj.ftoc(val));
            }
            else if(F.equals("K")){
                System.out.println(obj.ftok(val));
            }
            else{
                System.out.println("Something Went Wrong......");
            }
        }

        else if(num1==3){
            System.out.print("Enter Value(Kelvin): ");
            double val = sc.nextDouble();
            System.out.println("For Kelvin to Celius coversion input C\nFor Kelvin to Fahrenheit conversion input F");
            System.out.print("Input(C or F): ");
            String K = sc.next();
            if(K.equals("C")){
                System.out.println(obj.ktoc(val));
            }
            else if(K.equals("F")){
                System.out.println(obj.ktof(val));
            }
            else{
                System.out.println("Something Went Wrong......");
            }
        }
        else{
            System.out.println("Something Went Wrong......");
        }
        sc.close(); 
    }
}
