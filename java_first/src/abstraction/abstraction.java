package abstraction;

public class abstraction {
  public static void main(String[] args) {
	threeseries n=new threeseries();
	n.accelarate();
	n.start();
}
}

 abstract class bmw{
	 void start() {
		 System.out.println("BMW Started");
	 }
	 abstract void accelarate();	 
 } 
 
class threeseries extends bmw{

	@Override
	void accelarate() {
		System.out.println("implementation");
	}
}
class four extends bmw{

	@Override
	void accelarate() {
		System.out.println()
		
	}
	
}