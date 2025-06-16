//abstract and anonymous


abstract class in_ano{
    public void show(){
        System.out.println("In show");
    }
    public abstract void newshow();
}

public class day_16_anonymous_inner_class {
    public static void main(String[] args) {
        in_ano obj = new in_ano(){
            public void show(){
                System.out.println("in anonymous class");
            }
            public void newshow(){
                System.out.println("In abstract anonymous new show");
            }

        };
        obj.show();
        obj.newshow();        
    }
}
