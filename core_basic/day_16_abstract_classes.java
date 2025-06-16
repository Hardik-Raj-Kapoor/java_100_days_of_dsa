//abstract method can only be used in abstract classes
//can only be used to declare and not define
abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Play Music");
    }
}
// WagonR must implement the instanted abstract method in Car: Overwrite the method
class WagonR extends Car{ //concrete class
    public void drive(){
        System.out.println("Driving");
    }
}

// cannot create object of abstract class
public class day_16_abstract_classes {
    public static void main(String[] args) {
        
        //Car obj = new Car(); X
        Car obj = new WagonR();
        obj.playMusic();
        obj.drive();
    }

}
