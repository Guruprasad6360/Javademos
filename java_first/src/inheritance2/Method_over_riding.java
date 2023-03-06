package inheritance2;

public class Method_over_riding {
   public static void main(String args[]) {
	// vechile v=new vechile();
	// v.fuel();
	 
	 bus b=new bus();
	 b.fuel();
   }
}
   class vechile{
       void fuel() {
    	   System.out.println("petrol:");
       }
   }
   class bus extends vechile{
	   void fuel() {
		   super.fuel();
		   System.out.println("desial");
	   }
   }
   class car extends vechile{
	   
   }
   class bike extends vechile{
}

