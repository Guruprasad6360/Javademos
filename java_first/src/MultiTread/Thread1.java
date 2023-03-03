package MultiTread;

public class Thread1 {
 public static void main(String[] args) {
	 multiThread t=new multiThread();
	 t.start();
	 singleThread T=new singleThread();
	 T.printno();
}
}
class singleThread{
	void printno() {
		for(int i=0; i<=100; i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class multiThread extends Thread{
	public void run() {
		for(int i=0; i<=100; i++) {
			System.out.println(Thread.currentThread().getName()+ "-"+ i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}