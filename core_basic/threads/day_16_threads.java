package threads;
//every thread must have run method
class A_thread extends Thread{
    public void run(){
        for(int i = 0;i<100;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);//waiting stage
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B_thread extends Thread{
    public void run(){
        for(int i = 0;i<100;i++){
            System.out.println("Hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
//run is called using star
public class day_16_threads {
    public static void main(String[] args) {
        A_thread obj1 = new A_thread();
        B_thread obj2 = new B_thread();
        //obj1.setPriority(8); To set priority
        obj2.setPriority(Thread.MAX_PRIORITY);//Maximum Priority
        //obj2.setPriority(Thread.MIN_PRIORITY);//Miniimum Priority
        
        System.out.println(obj1.getPriority());//1 is the least, 10 is the highest
        obj1.start();
        obj2.start();
    }
}
