class Aa{
    public void show(){
        System.out.println("in A");
    }
    public String toString(){//object class Overriding
        return "toString A";
    }
}

class Bb extends Aa{
    public void show(){
        System.out.println("in B");
    }
    public String toString(){//object class Overriding
        return "toString B";
    }
}

final class Cc{//final class cannot be extended
    final public void show(){//final method cannot be overrided 
        System.out.println("in C");
    }
}
public class day_4_dynamic_method_dispatch {
    public static void main(String args[]){
        Aa obj = new Bb();
        obj.show();
        Aa obj1 = new Aa();
        obj1.show();
        obj1 = new Bb();
        obj1.show();
        final int num1 = 9; //the value cannot be changed and is now constant
        System.out.println(num1);   
        Aa obj2 = (Aa) new Bb();//upCasting
        System.out.println(obj2);
        Bb obj3 = (Bb) obj2;//DownCasting
        System.out.println(obj3);
        int num3 = 0;
        Integer num2 = num3; //autoboxing
        System.out.println(num2);
        int num4 = num2; //auto unboxing
        System.out.println(num4);
}
}