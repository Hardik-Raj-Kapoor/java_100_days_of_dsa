@FunctionalInterface
interface Fn_lam {
    int show(int i,int j);
    //void apply();
}



public class day_16_lamda_expression {
    public static void main(String[] args) {
    
        /*method 1 */
        // Fn_lam obj = () -> {
        //   System.out.println("in Lambda");  
        // };

        // Fn_lam obj = (int i, int j) -> {
        //   System.out.println("in Lambda");  
        // };

        /*method 2 */
        // Fn_lam obj = () ->  System.out.println("in Lambda");
        // obj.show();

        // Fn_lam obj = (int i,intj) ->  System.out.println("in Lambda");
        // obj.show(5,5);

        // Fn_lam obj = (i,j) ->  System.out.println("in Lambda");
        // obj.show(5,5);
        

        /*reduced code */
        // Fn_lam obj = (i,j )->  {
        //     System.out.println("in Lambda");
        //     return i+j;
        // };
        // obj.show(5,5);
    
        Fn_lam obj = (i,j )-> i+j; //returns i+j
        obj.show(5,5);
    }
}
