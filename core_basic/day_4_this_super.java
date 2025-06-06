class A{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A numbered");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n){
        this(); 
        System.out.println("in B numbered");
    }
}


public class day_4_this_super {
    public static void main(String args[]){
        B obj = new B(3);
    }
}
