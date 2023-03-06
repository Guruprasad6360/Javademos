package ThreadDemo;

import MultiTread.Utils;

public class Dead_lock {
 public static void main(String[] args) throws InterruptedException {
    mythread my=new mythread();
    Thread t=new Thread(my);
	t.setName("T1");
	t.start();
	synchronized(t) {
		Utils.printmessage("going to wait");
		t.wait();
		Utils.printmessage("Notify");
		Utils.printmessage("Total="+ mythread.total);
	}
}
}
class mythread implements Runnable{
	static int total;
	public void run() {
		Utils.printmessage("calculating sum");
		synchronized(this) {
		for(int i=0; i<=100; i++) {
			total+=i;
		}
		
	}Utils.printmessage("calciating completed...notify");
	this.notify();
}



  public int getTotal() {
	  return total;
	  
  }
  }
  