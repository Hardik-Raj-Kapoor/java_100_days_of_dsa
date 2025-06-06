import java.lang.Math;
class Calc{
        
        public int add(int a, int b){
            return a+b;
        }
        public int sub(int a, int b){
            return a-b;
        }
}

class AdvCalc extends Calc{//single level inheritance
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}

class VeryAdvCalc extends AdvCalc{//Multi level inheritance
    public double power(int a, int b){
        return Math.pow(a,b);
    }
}
//multiple inheritance is not possible
public class day_4_inherit {
    public static void main(String args[]){
        VeryAdvCalc num1 = new VeryAdvCalc();
        System.out.println(num1.add(10,15));
        System.out.println(num1.sub(10,15));
        System.out.println(num1.mul(10,15));
        System.out.println(num1.div(10,15));
        System.out.println(num1.power(10,15));
        
    }
}