package exception_handling;

class HardikException extends Exception{
    public HardikException(String str){
        super(str);
    }
}

public class day_16_custom_exception {
    public static void main(String[] args) {
        int j =2;
        int i = 0;
        //int[] arr = new int[4];
        
        try{
            if(i==0){
                throw new HardikException("Not possible: Hardik Exception");
            }
            j=18/i;
            //System.out.println(arr[5]);
        }
        catch(HardikException e){//executed only in case of exception
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
