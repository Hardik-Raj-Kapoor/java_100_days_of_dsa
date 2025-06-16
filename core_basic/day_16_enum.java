enum status{
    running, failed, pending, success;
}


public class day_16_enum {
    public static void main(String[] args) {
        status s = status.success;
        System.out.println(s+ " " + s.ordinal());

        status[] ss = status.values();
        System.out.println(ss);
        for(status i: ss){
            System.out.println(i+ " " + i.ordinal());
        }
    }

}