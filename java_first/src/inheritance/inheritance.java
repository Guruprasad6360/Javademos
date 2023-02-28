package inheritance;

public class inheritance {
  public static void main(String[] args) {
    Animal h=new Animal(20);
    h.print();
    
}
	  
  }
 class Animal{
	 int speed;
	 Animal(int s){
		 speed=s;
	 }
	 void print() {
		 System.out.println(speed);
	 }
 }

