package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Utildemo {
  public static void main(String[] args) {
	array_demo();
}
  private static void array_demo() {
	  int [] a= {40,10,15,7};
	  for(int i: a) {
		  System.out.println(i+" ");
		  Arrays.sort(a);
	  }
  }
}

	
