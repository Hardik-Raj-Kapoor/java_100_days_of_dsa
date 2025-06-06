public class day_2_for_dowhile_while {
    public static void main(String args[]){
        int i=1;
        for(; i<5;i++){
            System.out.println("Hello for");
        }
        while (i<10) {
            System.out.println("Hello while");
            i++;
        }
        do{
            System.out.println("Hello Dowhile");
        }while(i<1);
    }
}
