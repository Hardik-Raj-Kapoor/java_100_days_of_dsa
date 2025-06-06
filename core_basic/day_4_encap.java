class human{
    private int age;//cannot be accessed outside this class
    private String name;
    public human(){//Default constructor       //used to set a default value        
        System.out.println("In constructor");//called equal number of times as the number of objects created
        this.age = 18;
        this.name = "admin";
    }
    public human(int a, String n){//parameterized constructor
        age = a;
        name = n;
    }
    //can be accessed using methods
    public int getAge(){//getter
        return age;
    }
    public void setAge(int age){//setter
        this.age = age;//a reference variable that refers to the current object: This
    }

    public String getName(){//getter
        return name;
    }
    public void setName(String name){//setter
        this.name = name;
    }
}
public class day_4_encap {
    public static void main(String args[]){
        human man1 = new human();
        man1.setAge(21);
        man1.setName("Hardik");
        System.out.println(man1.getAge()+ " : " +man1.getName());
        human man2 = new human();
        System.out.println(man2.getAge()+ " : " +man2.getName());
        human man3 = new human(20,"John");
        System.out.println(man3.getAge()+ " : " +man3.getName());
        new human().getAge();//anonymous objects: can't be reused, i.e. only called once and no reference varible is assinged
    }
}
