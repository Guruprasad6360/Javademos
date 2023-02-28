package inheritance;

public class multiple_inherit {
  public static void main(String[] args) {
	 Tv t=new Tv();
	 t.poweron();
	 
	 monitor m=new monitor();
	 m.poweron();
	 
	 destop d=new destop();
	 l1.start();
}
}

 class electronic_device{
	 void poweron() {
		 System.out.println("Device Powered on");
	 }
 }

  class Tv extends electronic_device{
	  void poweron() {
			 System.out.println("Device Powered on");
		 }
  }
  class monitor extends electronic_device{
	  void poweron() {
			 System.out.println("Device Powered on");
		 }
  }
  
 class destop implements l1{{
	  l1.start();
  }
 }


  