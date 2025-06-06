class phone{
    String brand;
    int price;
    static String name; //Static variable: should be called using class

    static{//static block: only called once and first
        System.out.println("In static block");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
    public static void show1(){//Static method: only calls static variables and not instance variables
        System.out.println(name);
        System.out.println("In static method");
    }
    public static void show2(phone obj1){//Static method: can call instance variables if specified
        System.out.println(obj1.brand + " : " + obj1.price + " : " + name);
        System.out.println("In static method");
    }
}
public class day_4_static {
    public static void main(String args[]){
        phone obj1 = new phone();
        obj1.brand = "Apple";
        obj1.price = 1200;
        obj1.name = "SmartPhone";

        phone obj2 = new phone();
        obj2.brand = "Samsung";
        obj2.price = 1300;
        obj2.name = "SmartPhone";

        obj1.show();
        obj2.show();

        phone.name = "Phone"; // called using class
        phone.show1();// called using class
        phone.show2(obj1);
        obj1.show();
        obj2.show();
        
    }
}
