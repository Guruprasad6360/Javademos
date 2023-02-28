package inheritance;

public class Vechile_demo {
 public static void main(String[] args) {
   bus s=new bus();
	
}
}
 class vechile{
	 int a, b;
	 vechile(int a, int b){
		 this.a=a;
		 this.b=b;
	 }
	 void fuel() {
		 System.out.println("petrol");
	 }
 }
  class bus extends vechile{
	  int c,d;
	  bus(int c,int d){
		  super(0,0);
		  this.c=c;
		  this.d=d;
	  }
	  void fuel() {
		  super.fuel();
		  System.out.println("diesel");
	  }
  }
	  
  