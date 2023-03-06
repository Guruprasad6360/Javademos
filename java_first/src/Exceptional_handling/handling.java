package Exceptional_handling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class handling {
   public static void main(String[] args) {
	   nullpointer();
	   divide_by_zero();
   }
    private static void checkedexception() throws FileNotFoundException {
     FileInputStream fis=new FileInputStream("C:\\Users\\gbhagwat\\Desktop\\link");
    }
	private static void stringParseDemo() {
		String s="hello";
		int i=Integer.parseInt(s);
		System.out.println("convert Integer"+i);
		}
	private static void nullpointer() {
		try{String s=null;
		System.out.println(s.length());
		
	}catch(Exception E) {
		System.out.println(E.getMessage());
	}
	}
    private static void divide_by_zero(){
	int a,b,c,d;
	System.out.println("Enter 2 numbers");
	Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
	System.out.println("The value inputted by user="+ a);
	System.out.println("Enter one more number");
	b=sc.nextInt();
	System.out.println("The second number inputted" + b);
	try{c=a/b;
	d=a%b;
	System.out.println(a+"/"+ b+ "=" +c +" remainder="+d);
	System.out.println("end");
	}catch(ArithmeticException e) {System.out.println("exception occured"+e.getMessage());}
}
}
}


