package inheritance2;

public class Constructorchain {
   public static void main(String args[]) {
	   child c=new child();
   }
}
class superclass{
	int x;
	superclass(){
		System.out.println("no args class");
	}
	superclass(int x){
		this.x=x;
		System.out.println("one arg superclass constructor");
	}
}
 class child extends superclass{
	 child(){
		// this(10);
		 System.out.println("base super class of child");
	 }
	 child(int y){
		 super(y);
		 System.out.println("one argument child class");
	 }
 }