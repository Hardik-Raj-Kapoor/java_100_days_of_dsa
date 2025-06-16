package exception_handling;
public class day_16_multiple_catch_exception {
    public static void main(String[] args) {
        int j =2;
        int i = 0;
        int[] arr = new int[4];
        try{
            j=j/i;
            System.out.println(arr[5]);
        }catch(ArithmeticException e){//executed only in case of exception
            if(i==0){

                System.out.println("cannon be divided by zero");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Be in your limits.");
        }
        System.out.println("Here is your answer");
    }
}
