package java_first;

public class Data_types {
  static byte a=127;
   public static void main(String args[]) {
	  System.out.println(a);
	  a=(byte) 150;   // collecting garbage value
	  
	  int c=100;
	 System.out.println(a);
	 
	System.out.println(Integer.MAX_VALUE); // to know the max value of datatype such as integer
       	
	int a=65;
	long l=a;
	char ch='a';
	System.out.println(ch);
	
    int y=119;
    char z=(char) y;
    System.out.println(z);
	
   }
}
