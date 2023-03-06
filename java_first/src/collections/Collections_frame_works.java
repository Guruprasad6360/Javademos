package collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.Vector;

public class Collections_frame_works {
  public static void main(String[] args) {
	int arr[]=new int[] {1,2,3,4};
	ArrayList<Integer>v=new ArrayList();
	Hashtable<Integer,String> h=new Hashtable();
	PriorityQueue<Integer> q =new PriorityQueue<Integer>();
	v.add(1);
	v.add(2);
	System.out.println(v);
	v.remove(0);
	
	h.put(1, "geeks");
	h.put(2, "gfg");
	System.out.println(h);
	q.add(10);
	System.out.println(q.peek());
}
}
