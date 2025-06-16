package exception_handling;
class MyException extends Exception{
	public MyException(String string){
		super(string);
	}
}

class Aexp{
	public void show() throws ClassNotFoundException{
//    	try
//    	{
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}
		
		Class.forName("Calc");
	}
}

public class day_16_throws_finally_exception {
    static {
		System.out.println("Class Loader");
	}
	
    public static void main(String[] args) {	
//    	try
//    	{
//    		Class.forName("Class");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}
    	
    	Aexp obj=new Aexp();
    	try {
    		obj.show();
    	}catch(ClassNotFoundException e){
    		e.printStackTrace();
    	}
    	finally{
			System.out.println("I will get executed with or without exception ");
		}
    	
    }
}
