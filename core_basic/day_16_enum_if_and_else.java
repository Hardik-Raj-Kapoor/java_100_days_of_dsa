enum status1{
    running, failed, pending, success;
}


public class day_16_enum_if_and_else {
    public static void main(String[] args) {
        status1 s = status1.failed;
        if(s == status1.running){
            System.out.println("In process");
        }
        else if(s == status1.pending){
            System.out.println("Still pending");
        }
        else if(s== status1.success){
            System.out.println("Process done");
        }
        else{
            System.out.println("Failed");
        }

        switch (s) {
            case running:
                System.out.println("in process");
                break;
            case pending:
                System.out.println("still pending");
                break;
            case success:
                System.out.println("process done");
                break;
            default:
                System.out.println("failed");
                break;
        }
    }
}
