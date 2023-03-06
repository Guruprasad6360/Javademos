package ThreadDemo;

import MultiTread.Utils;

public class Synchro {
   public static void main(String[] args) {
	System.out.println("sndl");
	Monitor mon = new Monitor();
	Thread t1=new Thread(new worker(mon,"strive"));
	t1.setName("t1");
	Thread t2=new Thread(new worker(mon,"roger"));
    t2.setName("t2");
    t1.start();
    t2.start();
   } 
}

class worker implements Runnable{
    Monitor monitor;
    String name;

	worker(Monitor monitor, String name){
		this.monitor=monitor;
		this.name=name;
	}
	public void run() {
	  monitor.display(name);
		
	}
	
}
class Monitor{
	public void display(String name) {
		for(int i=0; i<=10; i++) {
		Utils.printmessage(i+"How are You "+ name+ "?");
  		try {
	        Thread.sleep(500);		
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}