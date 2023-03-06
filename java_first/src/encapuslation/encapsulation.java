package encapuslation;

public class encapsulation {
   public static void main(String[] args) {
	Car c=new Car();
	c.set_colour(Car.getnum(5));
}
}
class Car{
	private String colour;
	private int num;
	private boolean cus;
	
	public static String manufactor="honda";
	
	public Car() {
		num=4;
		colour="white";
		cus=false;
		
	}
	public static String getnum(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public String get_colour() {
		return colour();
	}
	private String colour() {
		// TODO Auto-generated method stub
		return null;
	}
	public void set_colour(String colour) {
		if(cus) {
			this.colour=colour;
		}
	}public int getnum() {
		return num;
	}
	public void set_no_weels(int no) {
		this.num=no;
	}
}

