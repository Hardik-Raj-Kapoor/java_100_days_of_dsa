package exception_handling;

public class day_16_throw_exception {
    public static void main(String[] args) {
        int j =2;
        int i = 0;
        //int[] arr = new int[4];
        
        try{
            if(i==0){
                throw new ArithmeticException("Not possible");
            }
            j=18/i;
            //System.out.println(arr[5]);
        }
        catch(ArithmeticException e){//executed only in case of exception
            j = j/1;
            System.out.println("It is what it is "+e);
        }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Be in your limits.");
        // }
        System.out.println(j);
        System.out.println("Here is your answer");
    }
}
