package maps;

public class Inner_class {
  
	 public static void main(String[] args[]) {
   	  Inner s=new Inner();
   	  Inner.hello s1= s.new hello();
   	  s1.hello();
   	  
	 }

  private String msg="welcome to java";
  class Inner{
	  class hello{
	  void hello() {
		  System.out.println(msg+"Let us start inner classes " );
	  }
  
 	  
  }
  }
}

//OuterClass.InnerClass innerObject = outerObject.new InnerClass();