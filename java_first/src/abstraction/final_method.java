package abstraction;

public class final_method {
  public static void main(String[] args) {
	int x=5;
	x=9;
	
	A b=new A();
	b.method();
}
}
class A{
	final void method() {
		System.out.println("hi hello");
	}
}
