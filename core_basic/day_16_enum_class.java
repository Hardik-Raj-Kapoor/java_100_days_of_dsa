enum enum_Laptop{
//	Mackbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);
	Mackbook(2000), XPS(2200), Surface, ThinkPad(1800);
	private int price;
	private enum_Laptop(){
		price=500;
	}
	
	private enum_Laptop(int price){
		this.price=price;
	}
	
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price=price;
		System.out.println("in Laptop" + this.name());
	}
}



public class day_16_enum_class{
    public static void main(String[] args){

//    	Laptop lap=Laptop.Mackbook;
//    	System.out.println(lap+ " : "+lap.getPrice());
    	
    	for(enum_Laptop lap : enum_Laptop.values())
    	{
    		System.out.println(lap+" : "+lap.getPrice());
    	}
    }
}
