interface interone{
	int age=44;
	String area="Mumbai";
	
	void show();
	void config();
}

interface intertwo{
	void run();
}
interface interthree extends intertwo{
	
}

class interfour implements interthree,interone{
	public void show(){
		System.out.println("in show");
	}
	public void config(){
		System.out.println("in cofing");
	}
	public void run(){
		System.out.println("running...");
	}
}


public class day_16_more_interfaces{
    public static void main(String[] args){
    	interone obj;
    	obj=new interfour();
    	
    	obj.show();
    	obj.config();
    	
    	intertwo obj1=new interfour();
    	obj1.run();
    	
    	System.out.println(interone.area);
        
    }
}
