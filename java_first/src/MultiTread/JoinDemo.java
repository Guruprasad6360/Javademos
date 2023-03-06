package MultiTread;

import java.util.Scanner;

public class JoinDemo {
  public static void main(String[] args) {
	 
	System.out.println("sum of first N numbers");
	System.out.println("Enter the value of N");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Calculator c=new Calculator(n);
	c.start();
	try {
	    c.join();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	printmessage("sum of first " + n + "number=" +c.getsum());
}

private static void printmessage(String message) {
   System.out.println(Thread.currentThread().getName() + "-" +message);
	
}
}

class Calculator extends Thread{
	int n;
	int sum;
	Calculator(int n){
		this.n=n;
	}
	public void run() {
		for(int i=1; i<=n; i++) {
			this.sum+=i;
		}
	}
	public int getsum() {
		return sum;
	}
}
