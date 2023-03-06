package java_first;

public class Type_casting {
   public static void main(String[] args) {
	// double datatype
	   
	   double d=100.04;
	   
	   // Exlicit type casting by forcefully getting data
	   
	   long l=(long)d;
	   
	   //explicit type casting
	   int i=(int)l;
	   
	   System.out.println("double value:"+d);
	   System.out.println("long value"+l);
	   System.out.println("int value"+i);
	   
	   // implicit type convertion
	   int m=100;
	   long n=m;
	   float f=l;
	   System.out.println("Int value"+i);
	   System.out.println("long value"+n);
	   System.out.println("float value"+f);
	   
}
}
