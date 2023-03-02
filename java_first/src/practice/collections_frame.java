package practice;

import java.util.List;
import java.util.Random;

public class collections_frame {
  public static void main(String[] args) {
	randomdemo();
}
  private static void randomdemo() {
	  Random obj =new Random();
	  System.out.println(obj);
  }
  private static void hashsetdemo() {
	  Random random = new Random();
	  List<Integer> list =(List<Integer>) new Random();
	  for(int i=1; i<=10; i++) {
		  list.add(random.nextInt(1,10));
	  }
  }
}
