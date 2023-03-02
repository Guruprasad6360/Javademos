package practice;
import java.util.ArrayList;
import java.util.LinkedList;
public class collections {
 public static void main(String[] args) {
	demo3();
}
   private static void demo3() {
	   LinkedList<String> list =new LinkedList<String>();
	   list.add("10");
	   list.add("string");
	   list.add("10");
	   list.add("9");
	   System.out.println(list);
	   
	   list.add(3,"101");
	   System.out.println(list);
	   list.remove(3);
	   System.out.println(list);
	   if(list.contains("10")) {
		   System.out.println("5 is present");
	   }else {
		   System.out.println("not present");
	   }
		   
	   
   }
}
