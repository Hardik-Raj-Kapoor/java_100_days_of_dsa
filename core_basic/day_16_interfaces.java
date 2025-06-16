//Interfaces are by default public abstract methods
//uses implements instead of extends
// all the variables in interfaces are by default final and static

interface Interface{
    int age=21;
    String area = "U.P.";
    void show();
    void in();
}
class Inter implements Interface{
    public void show(){
        System.out.println("In show");
    }
    public void in(){
        System.out.println("Interfaces");
    }
}
public class day_16_interfaces {
    public static void main(String[] args) {
        Interface obj;
        obj = new Inter();
        obj.show();
        obj.in();
        System.out.println(Interface.area+" "+ Interface.age);

    }
}
