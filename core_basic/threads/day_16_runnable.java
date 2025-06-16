package threads;
class AB_thread implements Runnable{
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

class BC_thread implements Runnable{
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
public class day_16_runnable {
    public static void main(String[] args) {
        Runnable obj1 =new AB_thread();
        Runnable obj2 =new BC_thread();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
