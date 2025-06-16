
class inner{
    public void in_inner(){
        System.out.println("In inner");
    }
    //A.b obj = <object of A>.new B;
    class inner_person{
        public void person(){
            System.out.println("in person");
        }
    }
    //A.B obj = new A.B();
    static class new_person{
        public void newperson(){
            System.out.println("in new person");
        }
    }
}



public class day_16_inner_class {
    public static void main(String[] args) {
        inner obj =new inner();
        obj.in_inner();
        inner.inner_person obj1 = obj.new inner_person();
        obj1.person();
        inner.new_person obj2 = new inner.new_person();
        obj2.newperson();
    }
}
