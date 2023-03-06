package Scanner;

import java.util.Scanner;

public class Scanner_demo {
 public static void main(String[] args) {
	Scanner_demo();
}
 
public static void Scanner_demo() {
	  int sum=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Number (char to exit");
	// int num=sc.nextInt();
	  while(sc.hasNextInt()) {
		int num=sc.nextInt();
		sum+=num;
		System.out.println("Enter a number (char to exist");
	  }System.out.println("sum"+ "  " + sum);
  }
}
