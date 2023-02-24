package inheritance;

public class jdkdemo {
   public static void main(String args[]) {
	jdk5 h=new jdk5();
   }
}
class jdk6{
	jdk6(){
		System.out.println("Installing jdk6;");
	}
}

class jdk5 extends jdk6{
	jdk5(){
		System.out.println("Installing jdk5");
	}
}
