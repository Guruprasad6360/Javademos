package inheritance;

public class Vechile_demo {
 public static void main(String[] args) {
	bike c=new bike();
	c.fuel();
	System.out.print(c.fuel());
}
}
   class vechile{
	   String fuel() {
		   return "petrol";
	   }
   }
   class bus extends vechile{
	   String fuel() {
		   return "cng";
	   }
   }
   class car extends vechile{
	   String fuel() {
		   return"diesal";

	   }
   }
  class bike extends vechile{
	  
  }