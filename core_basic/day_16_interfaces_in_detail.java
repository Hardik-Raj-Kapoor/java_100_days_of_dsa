interface computer_interface {
    void code();
}

class laptop_class implements computer_interface{
    public void code(){
        System.out.println("Code compile run");
    }
}

class desktop_class implements computer_interface{
    public void code(){
        System.out.println("Code compile run faster");
    }
}

class dev_class{
    public void devApp(computer_interface comp)
	{
		comp.code();
	}
}

public class day_16_interfaces_in_detail {
    public static void main(String[] args) {
        computer_interface lap = new laptop_class();
        computer_interface desk = new desktop_class();
        dev_class hardik = new dev_class();
        hardik.devApp(lap);
        hardik.devApp(desk);
    }
}
