package collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class queue_c {
 public static void main(String[] args) {
	Queue<Integer>s=new PriorityQueue<Integer>();
	Random r =new Random();
	for(int i=1; i<=10; i++) {
		s.offer(r.nextInt(1,10));
		
	}System.out.println(s);
	s.poll();
	System.out.println(s);
	s.poll();
	System.out.println(s);
}
}
