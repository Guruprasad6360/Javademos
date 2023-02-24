package java_first;

public class java_constructor {
   java_constructor(){
	   System.out.println("inside constorcter");
   }
   {
	   System.out.println("inside non static block");
	   
   }
   public static void main(String args[]) {
	   System.out.println("inside main method");
	   java_constructor h=new java_constructor();
	   
   }
}
