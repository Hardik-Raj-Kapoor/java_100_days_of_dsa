public class day_1 {
    public static void main(String[] args) {
        //variables
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        //data types
        byte one = 1;
        short Short = 100;
        int  Int = 200;
        long Long = 1000L;
        float ab = 100.3f;
        double doub = 2.01;
        char c = 'A';
        System.out.println("Byte: "+ one + ", Short: " + Short + ", Int: " + Int + 
        ", Long " + Long + ", Float: " + ab + ", Double: " + doub + ", Character: " + c);
    
        //literals
        int numbin = 0b101;
        System.out.println(numbin + "is Decimal value for 0b101.");
        int numhex = 0x1b;
        System.out.println(numhex + "is Decimal value for 0x1b.");
        double numbig= 12e10;
        System.out.println(numbig + "= Bigger Number");

        //conversion
        one=(byte)Int; //casting/explicit
        Int=one; //conversion/implicit
        System.out.println(one);
        Int = (int)ab;//lost float value: will do modulo with MAX_Value
        System.out.println(Int);
    }
} 