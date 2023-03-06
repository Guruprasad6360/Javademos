package polymorphism;

public class polymorphism {
  public static void main(String[] args) {
	  compile_time_polymorphism c=new compile_time_polymorphism();
	  c.add(2.4f, 2.8f);
}
}
// method overloading............
class compile_time_polymorphism{
	void add(int a, int b) {
		int res=a+b;
		System.out.println("Addition of 2 int "+ res);
	}
	
	void add(float a, float b) {
		float res=a+b;
		System.out.println("Addition of 2 floaitng values"+ res);
	}
}