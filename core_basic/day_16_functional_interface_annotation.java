@FunctionalInterface
interface Fn_interface {
    void show();
    //void apply();
}
class Fn_class_interface{
    void show(){
        System.out.println("in show");
    }

}

public class day_16_functional_interface_annotation {
    
    public static void main(String args[]){

        Fn_interface obj = new Fn_interface() {
            public void show(){
                System.out.println("In main class show");
            }
        };
        obj.show();
    }


}
