class AB{
    public void show(){
     System.out.println("in A");   
    }
    public void cfg(){
     System.out.println("in cfg");   
    }
}

class BC extends AB{
    public void show(){
        System.out.println("in B");
    }
}


public class day_4_method_overriding {
    public static void main(String args[]){
        BC obj = new BC();
        obj.show();
        obj.cfg();
    }

}
//public access modifier: can be accessed from anywhere
//default access modifier: can be accessed in the same package
//protected access modifier: can't be used outside package
//private access modifier: can be accessed only in same class