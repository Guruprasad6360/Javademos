package project_calculator;

public class methods_calling {
 public static void main(String[] args) {
	method m=new method();
	m.display(1.9, 2.9);
}
}
class method{
	void display(int a,int b) {
	int c=a+b;
	  System.out.println("the res is " + c);	
	}
	void display(double a,double b) {
		double c=a+b;
		System.out.println(c);
	}
}
 
