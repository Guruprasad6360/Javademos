package polymorphism;

public class run_time_poly {
  public static void main(String[] args) {
	Macbook s=new Macbookair();
	s.start();
}
}
 class Macbook{
	 void start() {
		 System.out.println("Macbook started:");
	 }
	 void shutdown() {
		 System.out.println("Macbook shutdown");
	 }
 }
	 
	 class Macbookair extends Macbook{
		 void start() {
			 System.out.println("Macbook started:");
	
		 } void shutdown() {
			 System.out.println("macbook");{
				 System.out.println("Maxbookair shutdown");
			 }
		 }
	 }
 