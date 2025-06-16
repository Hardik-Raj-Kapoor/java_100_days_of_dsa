class annotate1{
    public void show(){
        System.out.println("In 1 show");
    }
}

class annotate2 extends annotate1{
    @Override
    public void show(){
        System.out.println("in 2 show");
    }
}
public class day_16_annotations {
    public static void main(String[] args) {
        annotate1 obj1  = new annotate1();
        annotate2 obj2 = new annotate2();
        obj1.show();
        obj2.show();
    }

}
